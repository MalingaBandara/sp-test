package com.bitlord.four;

public class LargestPossibleNumber {
  
   

   

public static void main(String[] args) {
    
    //* Not Completed */
     // Create Largest possible number 
     int arr[] = { 50, 2, 1, 9 };

    
     int largestNumber = arr[0];


    for (int i = 1; i < arr.length; i++)
            {

                int sum =+ arr[i];

                if(arr[i ] > largestNumber){
                    largestNumber =+ arr[i];

                }
                else{

                }
            }
            
            System.out.println( largestNumber );

}

}
