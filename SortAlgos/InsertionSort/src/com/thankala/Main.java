package com.thankala;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 20;
        myArray[1] = 35;
        myArray[2] = 7;
        myArray[3] = 55;
        myArray[4] = -22;

        int newElement = 0;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++) {
            newElement = myArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && myArray[i - 1] > newElement; i--) {
                myArray[i] = myArray[i-1];
            }
            myArray[i] = newElement;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
