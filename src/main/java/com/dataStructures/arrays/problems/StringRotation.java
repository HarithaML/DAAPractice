package com.dataStructures.arrays.problems;

public class StringRotation {
    String string1;
    String string2;

    public StringRotation(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }


    public boolean check(){
        String s;
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        int index =0;
        for(int i =0;i<string1.length();i++) {
            if(chars1[i] == chars2[0]){
                index = i;
                break;
            }
        }
        if(isSubstring( index)){
            s = string1.substring(index,string1.length())+string1.substring(0,index);
            return s.equals(string2);
        }
        return false;
    }
    public boolean isSubstring(int index){
         return string1.substring(index,string1.length()).equals(string2.substring(0,string1.length()-index));
    }
}
