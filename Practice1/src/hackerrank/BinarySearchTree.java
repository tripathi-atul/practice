package hackerrank;


class Node1 {
	int value;
	Node left,right;
	Node(int data) {
		this.value = data;
		left = right = null;
	}
}


public class BinarySearchTree {
	
	public static Node insert(Node root, int data) {
		Node current = root;
		if(root == null)
			return null;
		else if(data < root.value) {
				current = root;
				insert(root.left,data);
			}
			else if(data > root.value)
				insert(root.right,data);
			else
				
		
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Enter no. of Nodes to be Entered");
		int i = 0;
		while(i-->0){
			
		}
		// TODO Auto-generated method stub

	}

}
