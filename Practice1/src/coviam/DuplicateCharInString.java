package coviam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DuplicateCharInString {
	
	//not able to handle continuous character
	static void outputString(String input){
		int length = input.length();
		int temp;
		char [] inputChar = new char[input.length()]; 
		inputChar = input.toCharArray();
		for(int i = 0;i<inputChar.length;i++){
			for(int j=i+1;j<length;j++){
				if(inputChar[i] == inputChar[j]){
					for( temp = j;temp< length-1;temp++){
						inputChar[temp] = inputChar[temp+1];
					}
					inputChar[temp] = 0;
					length = length-1;
				}
			}
		}
		for(int m = 0;m<length;m++)
		System.out.print(inputChar[m]);
	}
	
	
	//with arraylist
	static void duplicate(String input){
		int count  = 0;
		char[] charArray = new char[input.length()];
		charArray = input.toCharArray();
		List list1 = Arrays.asList(charArray);
		
		ArrayList list2= new ArrayList(Arrays.asList(charArray));
		ArrayList<Character> list=(ArrayList<Character>) list2.get(0);
		
		
		for(Object x : list2 ){
			System.out.println(x);
		
		/*for(int i = 0; i< list.size();i++){
			for(int j =i+1;j<list.size();j++){
				if(list.get(i) == list.get(j)){
					list.remove(j);
				}*/
			}
		
			
		
	}

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the String from which duplicate char needs to be removed");
	  String input = sc.next();
	  //outputString(input);
	  duplicate(input);

	}

}
