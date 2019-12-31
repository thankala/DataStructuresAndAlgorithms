package com.thankala;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {5, 6, 293, 233, -3454};


        int largestIndex = 0;
        int lastUnsortedIndex = myArray.length - 1;

        for (lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (myArray[largestIndex] < myArray[i]) {
                    largestIndex = i;
                }
            }
            swap(myArray, lastUnsortedIndex, largestIndex);
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
