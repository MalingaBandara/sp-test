package com.bitlord.first;

public class LoopQ {


   public void floopQ(int arr[]) {

    int sum = 0;
   
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    System.out.println( "The sum is: " + sum);

   }


    public void wloop( int arr[]) {

     int sum = 0; 

     int i=  arr.length;
     while (i > 0) {
         sum += arr[i-1];
       i--;
     }
    System.out.println( "The sum is(Using While loop): " + sum);
   }


   public void recur( int arr[], int i) {



}

}
