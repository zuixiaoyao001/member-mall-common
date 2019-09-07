package com.drawnblue.Enums;

public enum DelFlagEnum {

    NORMAL("正常",0),
    DEL_FLAG("刪除",1);
   private String name;
   private int flag;
   private DelFlagEnum(String name,int flag){
       this.flag = flag;
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public int getFlag() {
        return flag;
    }
}
