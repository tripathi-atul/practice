
public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = " Rs 5,000";
		System.out.println(abc.replaceAll("[^\\d.]", "").length());
		System.out.println(abc.length());
		

	}

}
