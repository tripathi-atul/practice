
public class CustomArrayList {
	
	Object myStore[];
	private int actSize = 0;
	private int capacity = 10;

	public CustomArrayList() {

	myStore = new Object[capacity];

	}

	public boolean add(Object element) {

	
	if(actSize == capacity) {
	capacity = capacity*2;
	this.increaseSize(capacity);
	}

}

	void increaseSize(int capacity) {
		
	}
	
	public static void main(String[] args) {
		CustomArrayList ca = new CustomArrayList();
		ca.add(1);
	}
	}
