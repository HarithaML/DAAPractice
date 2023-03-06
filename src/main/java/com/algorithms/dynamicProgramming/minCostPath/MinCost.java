package com.algorithms.dynamicProgramming.minCostPath;

import java.util.Arrays;

public class MinCost {
    int m, n;
    int[][] a;

    public MinCost(int[][] a) {
        this.m = a.length;
        this.n = a[0].length;
        this.a = a;
    }

    public int findCost(int x, int y){
       int cost =0;
        int i=x;
        int j=y;
       if(x>y){
           //come down column -1 till x =y;
           while(i!=j){
               cost = cost + a[i][j];
               i =i-1;
           }
           //diagnolly adds cost till (0,0)
           while((i!=0)&&(j!=0)){
               cost = cost + a[i][j];
               i=i-1;
               j=j-1;
           }
           cost = cost + a[i][j];
           return cost;
       }else if(x<y){
           return cost;
       }else {
           //x=y
           //diagnolly adds cost till (0,0)
           while((i!=0)&&(j!=0)){
               cost = cost + a[i][j];
               i=i-1;
               j=j-1;
           }
           cost = cost + a[i][j];
           return cost;
       }
    }

    public int findMin(){
        int[] costs = new int[a.length*a[0].length];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j< a[0].length;j++){
               costs[k] = findCost(i,j);
               k++;
            }
        }
       int min = costs[0];
        for (int cost : costs) {
            if (min < cost) {
                min = cost;
            }
        }
       return min;
    }



}
