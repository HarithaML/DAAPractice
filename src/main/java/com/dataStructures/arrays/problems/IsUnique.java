package com.dataStructures.arrays.problems;

public class IsUnique {
    String string;

    public IsUnique(String string) {
        this.string = string;
    }

    public boolean isUnique(){
        char[] chars = this.string.toCharArray();
        int count = 0;
        for(int i =0;i<chars.length;i++){
            for(char c :  chars){
                if(chars[i] == c){
                    count++;
                }
            }
            if(count>1){
                return false;
            }else{
                count =0;
            }
        }
        return true;
    }
}
