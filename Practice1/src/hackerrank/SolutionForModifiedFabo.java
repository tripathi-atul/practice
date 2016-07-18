package hackerrank;

import java.util.Scanner;

public class SolutionForModifiedFabo {
	
	    int  count = 2;
	    long nextTerm= 0;
	     void calculateNthTerm(long firstNumber,long secondNumber,int nthNumber){
	        
	        	if(count == nthNumber)
	        		return;
	        	else{
	            nextTerm = (int)(Math.pow(secondNumber,2)) + firstNumber;
	            firstNumber = secondNumber;
	            secondNumber = nextTerm;
	            count = count+1;
	            calculateNthTerm(firstNumber,secondNumber,nthNumber);
	        	}
	       
	    }

	    public static void main(String[] args) {
	        Scanner sc = new  Scanner(System.in);
	        long firstNumber = sc.nextLong();
	        long secondNumber = sc.nextLong();
	        int nthNumber = sc.nextInt();
	        SolutionForModifiedFabo sl = new SolutionForModifiedFabo();
	        sl.calculateNthTerm(firstNumber,secondNumber,nthNumber);
	        System.out.println(sl.nextTerm);
	    }
	}


