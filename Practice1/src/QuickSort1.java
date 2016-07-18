import java.util.*;
public class QuickSort1 {
       
          static void partition(int[] ar) {
              int pivotElement = ar[0];
              int length = ar.length;
              int j = 0;
              int temp = 0;
              for(int i = 1; i < length; i++) {
                  if(ar[i] < pivotElement) {
                      j = j+1;
                      temp = ar[j];
                      ar[j] = ar[i];
                      ar[i] = temp;
              }
                  ar[j++] = pivotElement;
                  
       }   
              printArray(ar);
          }
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }