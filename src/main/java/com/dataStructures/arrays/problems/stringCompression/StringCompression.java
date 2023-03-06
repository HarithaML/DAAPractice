package com.dataStructures.arrays.problems.stringCompression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    String string;

    public StringCompression(String string) {
        this.string = string;
    }

    public String compress() {
        char[] chars = string.toCharArray();
        ArrayList<KeyValue> keyValues = new ArrayList<>();
        int i =0;
        while(i<chars.length){
            //for each character
            int count =1;
           for(int j=i;j<chars.length;j++){
               if(j+1<chars.length){
                   if(chars[i]==chars[j+1]){
                       count ++;
                   }else{
                       break;
                   }
               }
           }
           KeyValue keyValue = new KeyValue(chars[i],count);
           i = count+i;
           keyValues.add(keyValue);


        }
        String s = "";
        for (KeyValue keyValue : keyValues) {
            s = s + keyValue.getC() + keyValue.getX();
        }
        return s;
    }
}
