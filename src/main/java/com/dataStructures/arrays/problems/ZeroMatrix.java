package com.dataStructures.arrays.problems;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    int n;
    int m;
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> cols = new HashSet<Integer>();

    int[][] matrix;

    public ZeroMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.m = matrix.length;
        this.n = matrix[0].length;

    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void set(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(this.matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        replaceWithZero();
    }
    public void replaceWithZero(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows.contains(i)||cols.contains(j)){
                    this.matrix[i][j] = 0;
                }
            }
        }
    }



}
