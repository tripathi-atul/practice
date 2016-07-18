package com.atul;
import java.io.*;
import java.util.*;

public class Solution {
    
    static void arraySum(int n, int[] arrayElements){
        int sum = 0;
        int element = 0;
       
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the size of array");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Please enter the array elements");
        for(int i=0;i<size;i++){
        	a[i] = sc.nextInt();
        }
        int arrayElements = sc.nextInt();
        arraySum(size, a);
        
     
    }
}