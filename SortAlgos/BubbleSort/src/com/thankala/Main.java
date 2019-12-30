package com.thankala;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 11;
        myArray[2] = 2221;
        myArray[3] = 527;
        myArray[4] = 0;

        int a = 0;

        for(int k=myArray.length-1;k>0;k--){
            for(int i=0;i<k;i++){
                if(myArray[i]>myArray[i+1]){
                    a= myArray[i+1];
                    myArray[i+1] = myArray[i];
                    myArray[i]=a;
                }else{
                    continue;
                }
            }
        }

        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
    }
}
