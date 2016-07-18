package hackerrank;

import java.util.Scanner;

public class StairCaseDraw {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int height;
		height = sc.nextInt();
		drawVirtualStairs(height);
	}

	private static void drawVirtualStairs(int height) {
		int count =1;
		// TODO Auto-generated method stub
		for(int i=0; i<height; i++){
			for(int j=0; j<height-count; j++){
				System.out.print(" ");
			}
			for(int k=0; k<count; k++){
				System.out.print("#");
			}
			System.out.println();
			count=count+1;
		}
		
	}

}
