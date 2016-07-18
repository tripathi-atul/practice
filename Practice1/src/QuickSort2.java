import java.util.*;
public class QuickSort2 {
       
    
    static int partition(int[] ar,int low, int high) {
        int pivotElement = ar[low];
        int j = low;
        int temp = 0;
        for(int i = low+1; i <= high-1; i++) {
            if(ar[i] < pivotElement) {
                j = j+1;
                temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
            }
        }
        ar[low] = ar[j];
        ar[j] = pivotElement;
        return j;
    }
          static void quickSort(int[] ar,int low, int high) {
               if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(ar, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(ar, low, pi);
            quickSort(ar, pi+1, high);
                    
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
           quickSort(ar,0,n);
       }    
   }
