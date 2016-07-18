package hackerrank;

import java.util.Scanner;

public class SoultionForPerfectSquare {
    static void solutionMethod(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
        	count = 0;
            int firstNumber = arr[i];
            int secondNumber = arr[++i];
            double sqrtFirstNumber = Math.sqrt(firstNumber);
            double sqrtSecondNumber = Math.sqrt(secondNumber);
            double firstInteger = Math.ceil(sqrtFirstNumber);
            double lastInteger = Math.floor(sqrtSecondNumber);
            if(firstInteger > lastInteger)
                System.out.println(count);
            else if(firstInteger <= lastInteger){
            while(firstInteger <= lastInteger){
                firstInteger = firstInteger+1;
                count = count+1;
            }
                System.out.println(count);
            }
    }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arraySize = 2*t;
        int arr[] = new int[arraySize];
        int index = -1;
        for(int a0 = 0; a0 < t; a0++){
            int initialNumber = in.nextInt();
            int lastNumber = in.nextInt();
            index = index+1;
            arr[index] = initialNumber;
            index = index +1;
            arr[index] = lastNumber;
        }
        solutionMethod(arr);
    }
}