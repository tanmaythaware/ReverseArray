package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[] {1,2,3,4,5};
	    reverseArray(array);
    }
    public static void reverseArray(int[] array){
        int temp;
        System.out.println("Original Array is " + Arrays.toString(array));
        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reversed Array is " + Arrays.toString(array));
    }
}
