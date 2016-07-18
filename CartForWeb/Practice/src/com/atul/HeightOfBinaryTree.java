package com.atul;

class Node1 {
	
	int data;
	Node1 left, right;
	
	Node1(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class HeightOfBinaryTree {
	
	int heightOfBinary(Node1 node) {
		if(node == null) {
			return 0;
		}
		
		int leftHeight = 1 + heightOfBinary(node.left);
		int rightHeight = 1 + heightOfBinary(node.right);
		int height = Math.max(leftHeight,rightHeight);
		return height;
		
	}
	
	

	public static void main(String[] args) {
		HeightOfBinaryTree h = new HeightOfBinaryTree();
		Node1 node = new Node1(5);
		node.left = new Node1(3);
		node.left.left = new Node1(1);
		node.right = new Node1(6);
		node.right.right = new  Node1(8);
		int k = h.heightOfBinary(node.left);
		System.out.println(k);

	}

}
