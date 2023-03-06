package com.algorithms.dynamicProgramming.minCostPath;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{13,14,15,16},{9,10,11,12},{5,6,7,8},{1,2,3,4}};
        print(a);

        a = new int[][]{{1, 5, 3}, {4, 8, 2}, {1, 2, 3}};
        print(a);

    }




    //private function
    private static void print(int[][] a){
        MinCost minCost = new MinCost(a);
        System.out.println("Costs of each path:");
        System.out.print("{");
        for(int i=0;i<a.length;i++){
            for(int j=0;j< a[0].length;j++){
                System.out.print("a["+i+"]["+j+"] = ");
                if(i== a.length-1 && j == a[0].length-1){
                    System.out.print(minCost.findCost(i,j));
                }else{
                    System.out.print(minCost.findCost(i,j)+" ,");
                }
            }
        }
        System.out.println("}");

        System.out.println("Minimum cost :"+minCost.findMin());


    }


}
