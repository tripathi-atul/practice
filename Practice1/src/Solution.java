import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i : map.keySet()){
    		
    			
    		}
    		
    	}
        // Fill up this function  
        int number = ar[ar.length-1];
        int flag;
        for(int i = ar.length-2;i >=0; i--) { 
        	flag=i;
            if(ar[i] > number) {
                ar[i+1] =ar[i];
            } 
            else {
            	ar[i+1] = number;
            	printArray(ar);
            	break;
            	
            }
            
               printArray(ar);
               if(flag == 0) {
               	ar[0] = number;
               	printArray(ar);
               }
        }
       
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
