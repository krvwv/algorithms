package com.algorithms;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array={7,4,8,224,54,15,88,23,62,21,1,6};
        System.out.println(Arrays.toString(array));
	    BubbleSort.bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
