package com.atul;

//Java program to find the element occurring odd number of times

class OddOccurrence
{
  int getOddOccurrence(int ar[], int ar_size) 
  {
      int i;
      int res = 0;
      for (i = 0; i < ar_size; i++) 
      {
          res = res ^ ar[i];
      }
      return res;
  }

  public static void main(String[] args) 
  {
	  OddOccurrence occur = new OddOccurrence();
      int ar[] = new int[]{8,4,4,8,23};
      int n = ar.length;
      System.out.println(occur.getOddOccurrence(ar, n));
  }
}
