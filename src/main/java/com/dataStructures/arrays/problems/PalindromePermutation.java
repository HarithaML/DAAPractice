package com.dataStructures.arrays.problems;

import java.util.Arrays;

public class PalindromePermutation {
    String string1;
    String string2;

    public PalindromePermutation(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public boolean check(){
        char[] chars1 = string1.toLowerCase().toCharArray();
        char[] chars2 = string2.toLowerCase().toCharArray();
        int i = 0, j = 0;

        while(i <chars1.length&&j<chars2.length){
            if(chars1[i]!= chars2[j] ){
                for (int k = j; k < chars2.length; k++) {
                    if (chars1[i] == chars2[k]) {
                        //swap characters in second string
                        char temp = chars2[k];
                        chars2[k] = chars2[j];
                        chars2[j] = temp;
                        break;
                    }
                }
            }
            i++;
            j++;
        }


        return new String(chars1).equals(new String(chars2));
    }

}
