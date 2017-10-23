package com.example.fragmentbestpractice;

import java.io.InputStream;
import java.util.List;

/**
 * Created by yang_chen on 2017/10/16.
 */

public interface wordparser {
    public List<word> parse(InputStream is)throws Exception;
    public String seriallize(List<word> words)throws Exception;
}
