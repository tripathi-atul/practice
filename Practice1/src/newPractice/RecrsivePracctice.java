package newPractice;

public class RecrsivePracctice {
	
	static int checkHeight(int n)  {
		if(n == 0) {
			return -1;
		}
		Math.max(checkHeight(n-1),checkHeight(n-1));
		return 5;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkHeight(3);

	}

}
