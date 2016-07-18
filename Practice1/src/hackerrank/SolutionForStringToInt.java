package hackerrank;

import java.util.Scanner;

public class SolutionForStringToInt {
    static void covertStringToInt(String s){
        int count =0;
        int covertedInt =0;
        try{
             covertedInt = Integer.parseInt(s);
    }
        catch(Exception e){
            count = 1;
        }
        if(count == 1){
            System.out.println("Bad String");
        }
        else{
            System.out.println(covertedInt);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
    }
}
