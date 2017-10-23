package com.example.fragmentbestpractice;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.sql.Connection;
import java.util.List;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
     final   AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.etWord);
        final TextView text = (TextView) findViewById(R.id.tvSearchResult);
        Button chaxun = (Button) findViewById(R.id.btnSearch);

        //List<word>try11 =DataSupport.findAll(word.class);
        //for(word tt:try11){
           // Log.d("ss",tt.getTrans());
       // }
        //final List<word>result  = DataSupport.where("word=?",geet).find(word.class);

        chaxun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getfromauto =auto.getText().toString();
                String sql="select * from word where  word = '"+getfromauto+"'";
                final Cursor cursor=DataSupport.findBySQL(sql);
               if(cursor.moveToFirst()){
                   do{
                       text.setText(cursor.getString(cursor.getColumnIndex("word"))+cursor.getString(cursor.getColumnIndex("trans")));
                   }
                   while(cursor.moveToNext());
               }
               cursor.close();
            }
        });


        }
    }


