package newPractice;


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class Return {
	
	  Node root;
	
	
	static int method1(Object o) {
		if(o == null) {
			System.out.println("atul");
			return 1;
		}
		System.out.println("tripathi");
		return 2;
		
	}
	
	 void insert(int key) {
	       root = insertRec(root, key);
	    }
	     
	    /* A recursive function to insert a new key in BST */
	    Node insertRec(Node root, int key) {
	 
	        /* If the tree is empty, return a new node */
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }
	 
	        /* Otherwise, recur down the tree */
	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);
	 
	        /* return the (unchanged) node pointer */
	        return root;
	    }

	public static void main(String[] args) {
		Return tree = new Return();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
		
		
		method1(null);
		

	}

}
