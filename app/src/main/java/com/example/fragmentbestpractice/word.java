package com.example.fragmentbestpractice;

import org.litepal.crud.DataSupport;

/**
 * Created by yang_chen on 2017/10/18.
 */

public class word extends DataSupport{
    private String word;
    private String trans;
    public String getWord(){
        return word;
    }
    public String getTrans(){
        return trans;
    }
    public void setWord(String word){
        this.word=word;
    }
    public void setTrans(String trans){
        this.trans=trans;
    }
}
