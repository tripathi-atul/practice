package hackerrank;

import java.util.Scanner;

public class ArbitraryMoney {
    
    static void calculateArbitrary(double[] arr){
        double initialAmount = 100000;
        double lastAmount = Math.round(100000/arr[0]/arr[1]/arr[2]);
        if(lastAmount > initialAmount)
            System.out.println((int)(lastAmount-initialAmount));
        else
            System.out.println(0);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfQuotes = sc.nextInt();
        double[] arr = new double[3];
        for(int i = 0; i < noOfQuotes; i++) {
            for(int j = 0; j < 3; j++) {
                arr[j] = sc.nextDouble();
        }
            calculateArbitrary(arr);
    }
}
}