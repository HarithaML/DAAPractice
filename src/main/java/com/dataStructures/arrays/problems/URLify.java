package com.dataStructures.arrays.problems;

public class URLify {
    String string;

    public URLify(String string) {
        this.string = string;
    }

    public String replace(){
        char[] chars = string.toCharArray();
        for(int i=0; i< chars.length;i++){
            if(chars[i] == ' '){
                string=string.substring(0,i)+"%20"+string.substring(i+1,string.length());
                i =0;
                chars = string.toCharArray();
            }
        }
        return string;
    }
}
