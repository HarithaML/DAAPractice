package com.dataStructures.arrays;

import com.dataStructures.arrays.problems.*;
import com.dataStructures.arrays.problems.stringCompression.StringCompression;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Dynamic Array
        System.out.println("-----------Dynamic Array:");
        MyArray dynamicArray = new MyArray();
        dynamicArray.push("apple");
        dynamicArray.push("ball");
        dynamicArray.push("cat");
        dynamicArray.push("dog");
        System.out.println("Array-Length: " + dynamicArray.length());
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        System.out.println("item at index 2: " + dynamicArray.get(2));
        dynamicArray.replace(1, "world");
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        dynamicArray.pop();
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        dynamicArray.delete(1);
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        System.out.println("Array-Length: " + dynamicArray.length());


        //String Reversal
        System.out.println("-----------String Reversal:");
        String name = "Haritha";
        StringReversal stringReversal = new StringReversal(name);
        System.out.println(name+": "+stringReversal.reverse());
         name = "Naveen";
        stringReversal = new StringReversal(name);
        System.out.println(name+": "+stringReversal.reverse());


        //Merge Sorted Arrays
        System.out.println("-----------Merge Sorted Arrays:");
        int[] array1 =new int[]{0, 3, 4, 31};
        int[] array2 = new int[]{4, 6, 30};
        MergeSortedArrays arrays = new MergeSortedArrays(array1, array2);
        int[] arr3 = arrays.merger();
        System.out.println(Arrays.toString(array1)+" + "+Arrays.toString(array2)+" = "+Arrays.toString(arr3));


        //IsUnique
        System.out.println("-----------IsUnique:");
        String string = "haritha";
        IsUnique isUnique = new IsUnique(string);
        System.out.println(string+": "+isUnique.isUnique());
         string = "naveen";
         isUnique = new IsUnique(string);
        System.out.println(string+": "+isUnique.isUnique());
        string = "ant";
        isUnique = new IsUnique(string);
        System.out.println(string+": "+isUnique.isUnique());
        string = "aaabbccdaa";
        isUnique = new IsUnique(string);
        System.out.println(string+": "+isUnique.isUnique());
        string = "abcd";
        isUnique = new IsUnique(string);
        System.out.println(string+": "+isUnique.isUnique());

        System.out.println("-----------Check Permutation:");
        String string1 = "abcd";
        String string2 = "dabc";
        CheckPermutation checkPermutation = new CheckPermutation(string1,string2);
        System.out.println(string1+" is a permutation of "+string2+" ?: "+checkPermutation.check());
        System.out.println("-----------URLify:");
        string = "Mr John Smith";
        URLify urLify = new URLify(string);
        System.out.println(string+": "+urLify.replace());
        string = "Muktevi Lakshmi Haritha";
        urLify = new URLify(string);
        System.out.println(string+": "+urLify.replace());

        System.out.println("-----------Palindrome Permutation:");
        string1 = "Tact Coa";
        string2 = "taco cat";
        PalindromePermutation palindromePermutation = new PalindromePermutation(string1,string2);
        System.out.println(string1+" is a palindrome permutation of "+string2+"? : "+palindromePermutation.check() );
        string1 = "Tact Coa";
        string2 = "atco cta";
        palindromePermutation = new PalindromePermutation(string1,string2);
        System.out.println(string1+" is a palindrome permutation of "+string2+"? : "+palindromePermutation.check() );

        System.out.println("-----------One Away:");
        string1 = "pale";
        string2 = "ple";
        OneAway oneAway = new OneAway(string1,string2);
        System.out.println(string1+" is one or zero edits away "+string2+" ? : "+oneAway.check());
        string1 = "pales";
        string2 = "pale";
        oneAway = new OneAway(string1,string2);
        System.out.println(string1+" is one or zero edits away "+string2+" ? : "+oneAway.check());
        string1 = "pale";
        string2 = "bale";
         oneAway = new OneAway(string1,string2);
        System.out.println(string1+" is one or zero edits away "+string2+" ? : "+oneAway.check());
        string1 = "pale";
        string2 = "bake";
         oneAway = new OneAway(string1,string2);
        System.out.println(string1+" is one or zero edits away "+string2+" ? : "+oneAway.check());

        System.out.println("-----------String Compression:");
        string = "aabcccccaaa";
        System.out.println(new StringCompression(string).compress());

        System.out.println("-----------Matrix Rotation:");
        int matrix[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };
        System.out.println("The  Matrix is: ");
//      prints matrix
        printMatrix(matrix);
        RotateMatrix rotateMatrix = new RotateMatrix(matrix.length,matrix);
        rotateMatrix.rotate();
        System.out.println("The Right Rotated Matrix is: ");
//      prints matrix after rotation
        printMatrix(rotateMatrix.getMatrix());


        System.out.println("-----------Zero Matrix:");
        int[][] matrix2= new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("The  Matrix is: ");
        printMatrix(matrix2);
        ZeroMatrix zeroMatrix = new ZeroMatrix(matrix2);
        zeroMatrix.set();
        System.out.println("The  Zero Matrix is: ");
        printMatrix(zeroMatrix.getMatrix());

        System.out.println("-----------String Rotation:");
        string1 = "waterbottle";
        string2 = "erbottlewat";
        StringRotation stringRotation = new StringRotation(string1,string2);
        System.out.println(stringRotation.check());
        string1 = "waterbottler";
        string2 = "erbottlewat";
         stringRotation = new StringRotation(string1,string2);
        System.out.println(stringRotation.check());

    }




    //private functions

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" " +"\t");
            }
            System.out.println();
        }
    }

}
