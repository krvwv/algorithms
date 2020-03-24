package com.algorithms;

public class BubbleSort {
    public static void bubble(Object[] array){
        Object temp;
        for (int i=array.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(((Comparable) array[j]).compareTo(array[j + 1]) > 0){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
