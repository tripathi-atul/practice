package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static void solutionMethod(int[] arrayOfInt){
        int noOf5s = 0;
        int noOf3s = 0;
       for(int i = 0; i < arrayOfInt.length; i++){
           
           noOf5s = (arrayOfInt[i] - arrayOfInt[i]%3);
           noOf3s = arrayOfInt[i] - noOf5s;
           if(noOf3s == 0){
        	   for(int  j =0;  j < noOf5s;  j ++){
        	   System.out.print(5);
        	   }
        	   System.out.println();
           }
           else if(noOf3s ==1 && (arrayOfInt[i] >=10)){
        	   noOf5s = arrayOfInt[i] -10;
        	   noOf3s = arrayOfInt[i] - noOf5s;
        	   for(int  j =0;  j < noOf5s;  j ++){
            	   System.out.print(5);
            	   }
        	   for(int  j =0;  j < noOf3s;  j ++){
            	   System.out.print(3);
            	   }
        	   System.out.println();
        	   
        	   
           }
           else if(noOf3s ==2 && (arrayOfInt[i] >=5)){
        	   
        	   noOf5s = arrayOfInt[i] -5;
        	   noOf3s = arrayOfInt[i] - noOf5s;
        	   for(int  j =0;  j < noOf5s;  j ++){
            	   System.out.print(5);
            	   }
        	   for(int  j =0;  j < noOf3s;  j ++){
            	   System.out.print(3);
            	   }
        	   System.out.println();
           }
     
           else
           {
        	   System.out.print(-1);
               System.out.println();
           }
           
       }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int index = 0;
        int arr[] = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            arr[index]=n;
            index = index + 1;
        }
        solutionMethod(arr);
    }
}
