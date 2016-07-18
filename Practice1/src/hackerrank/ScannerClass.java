package hackerrank;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//String  time="07:07:45PM";
		String newTime="";
		String firstTwoCharacter="";
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("please enter the new number");
		String time= sc.next();
		
	
		if(time.charAt(8)=='A'){
			for(int j =0; j<8;j++){
				newTime =newTime+time.charAt(j);
			}
			System.out.println(newTime+"AM");
		}
		else{
			for(int k=0;k<2;k++){
				firstTwoCharacter = firstTwoCharacter+time.charAt(k);
			}
			int firstTwoCharacterInt = Integer.parseInt(firstTwoCharacter);
			if(firstTwoCharacterInt == 12)
				firstTwoCharacterInt=00;
				firstTwoCharacterInt = firstTwoCharacterInt+12;
				System.out.print(firstTwoCharacterInt);
				for(int l=2;l<8;l++){
					System.out.print(time.charAt(l));
				}
				System.out.println("AM");
			}
			
		}
		

	

}
