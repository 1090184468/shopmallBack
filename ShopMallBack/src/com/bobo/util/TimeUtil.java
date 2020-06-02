package com.bobo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static String getDatetime(String formation){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formation);// yyyy-MM-dd HH:mm:ss
        //获取当前时间
        Date date = new Date(System.currentTimeMillis());
       return simpleDateFormat.format(date);
    }
}

