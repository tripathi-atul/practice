import java.lang.*;
import java.util.Scanner;
import java.io.*;

class ProductGfg {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int s = 0; s < testCase; s++) {
		boolean flag = false;
		int size = sc.nextInt();
		int product = sc.nextInt();
		int[] ar = new int[size];
		for(int i = 0; i < size; i++) {
		    ar[i] = sc.nextInt();
		}
		for(int j = 0; j < size-1;j++) {
		    for(int k=1;k<size;k++) {
		        if(product == ar[j]*ar[k]) {
		            flag = true;
		            break;
		        }
		    }
		    if (flag == true)
		    break;
		}
		if (flag == false)
		System.out.println("No");
		else
			System.out.println("Yes");
		}
	}
}