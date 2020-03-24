package com.algorithms;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[100000];
        int[] array2;
        for (int i=0;i<array.length;i++)
        {
            array[i]=random.nextInt(1000);
        }
        array2=Arrays.copyOf(array,array.length);

	    BubbleSort.bubble(array);
	    QuickSort.quick(array2,0, array2.length-1);

}
}
