package com.thankala;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 11;
        myArray[2] = 11;
        myArray[3] = 527;
        myArray[4] = 0;

        int temp = 0;

        for(int lastUnsortedIndex=myArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i=0;i<lastUnsortedIndex;i++){
                if(myArray[i]>myArray[i+1]){
                    swap(myArray,i,i+1);
                }else{
                    continue;
                }
            }
        }

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }

    public static void swap(int[] myArray, int i, int j){

        if(i==j){
            return;
        }
        int temp;

        temp= myArray[j];
        myArray[j] = myArray[i];
        myArray[i]=temp;
    }
}
