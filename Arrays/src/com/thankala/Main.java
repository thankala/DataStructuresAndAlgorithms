package com.thankala;

public class Main {

    public static void main(String[] args) {

        int[] myArray =  new int[7];

        myArray[0] = 5;
        myArray[1] = 56;
        myArray[2] = 533;
        myArray[3] = -54;
        myArray[4] = 87;
        myArray[5] = 12;
        myArray[6] = 42 ;

        int index = -1;
        for (int i=0; i<myArray.length;i++){
            if(myArray[i]==-54){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
