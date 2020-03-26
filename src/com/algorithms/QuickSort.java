package com.algorithms;

public class QuickSort {
    public static void Quick(int[] array, int p, int q){
        int pivot=array[(p+q)/ 2];
        int i,j,temp;
        i=p;
        j=q;
        while(i<=j){
            while(array[i]<pivot){
                i++;
            }
            while(array[j]>pivot){
                j--;
            }
            if(i<=j){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
                j--;
            }
        }
        if(j>p){
            Quick(array,p,j);
        }
        if(i<q){
            Quick(array,i,q);
        }
    }
}
