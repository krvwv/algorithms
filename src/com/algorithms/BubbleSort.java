package com.algorithms;

public class BubbleSort {
    public static void bubble(int[] array){
        int temp;
        for (int i=array.length-1;i>0;i--){
            boolean isSorted = true;
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    isSorted = false;
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
            if (isSorted)
                break;
        }
    }
}
