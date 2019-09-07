package com.drawnblue.util;

import java.util.UUID;

public class StringUtil {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replace("-","");
        return uuid;
    }

    public static boolean isEmpty(String str){
        if(str.trim() == null || str.trim().length() == 0){
            return false;
        }
        return true;
    }
}
