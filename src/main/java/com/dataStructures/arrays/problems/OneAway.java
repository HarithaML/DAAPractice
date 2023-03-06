package com.dataStructures.arrays.problems;

public class OneAway {
    String string1;
    String string2;

    public OneAway(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public boolean check(){
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        int i = 0,j =0;
        int removeCount = 0, insertCount = 0, replaceCount = 0;

        if(chars1.length>chars2.length){
            //remove
            while(i<chars1.length&&j<chars2.length){
                if(chars1[i]!=chars2[j]){
                    i++;
                    removeCount ++;
                }else{
                    i++;
                    j++;
                }
            }

        }else if(chars1.length<chars2.length){
            //insert
            while(i<chars1.length&&j<chars2.length){
                if(chars1[i]!=chars2[j]){
                    j++;
                    insertCount ++;
                }else{
                    i++;
                    j++;
                }
            }
        }else{
            //replace or same
            while(i<chars1.length&&j<chars2.length) {
                if(chars1[i]!=chars2[j]){
                    replaceCount++;
                }
                i++;
                j++;
            }
        }
        return (insertCount + removeCount + replaceCount) <= 1;
    }
}
