package com.algorithms.sorting.mergeSort;
//step 1: start
//
//step 2: declare array and left, right, mid variable
//
//step 3: perform merge function.
//    if left > right
//        return
//    mid= (left+right)/2
//    mergesort(array, left, mid)
//    mergesort(array, mid+1, right)
//    merge(array, left, mid, right)
//
//step 4: Stop
public class MergeSort {
   public int[] mergeSort(int a[], int n){
       if(n<2){
           return a;
       }
       int mid = n/2;
       int[] l = new int[mid];
       int[] r = new int[n-mid];

       for(int i = 0;i<mid;i++){
           l[i] = a[i];
       }
       for(int i = mid;i<n;i++){
           r[i-mid] = a[i];
       }
       mergeSort(l,mid);
       mergeSort(r,n-mid);

       merge(a,l,r,mid,n-mid);
       return  a;
   }
   public void merge(int a[],int l[],int r[],int left,int right){
       int i = 0, j = 0, k = 0;
       //copy smaller element to the array
       while (i<left && j<right){
           if(l[i] <= r[j]){
               a[k] = l[i];
               k = k+1;
               i = i+1;
           }else{
               a[k] = r[j];
               k = k+1;
               j = j+1;
           }
       }
       //copy rest of the elements to the array
       while (i < left) {
           a[k] = l[i];
           k = k+1;
           i = i+1;

       }
       while (j < right) {
           a[k] = r[j];
           k = k+1;
           j = j+1;
       }
   }

}
