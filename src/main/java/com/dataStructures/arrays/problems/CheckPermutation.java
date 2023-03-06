package com.dataStructures.arrays.problems;

public class CheckPermutation {
    String string1;
    String string2;

    public CheckPermutation(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public boolean check(){
        char[]  chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        if(chars1.length!=chars2.length){
            return false;
        }

        int rotations=0;
        for(int i=0;i<chars2.length;i++){
            if(chars1[0] == chars2[i]){
                rotations = i;
                break;
            }
        }
        return string1.equals(rotate(rotations, string2));
    }
    public String rotate(int rotations,String string){
        return string.substring(rotations,string.length())+string.substring(0,rotations);
    }


}
