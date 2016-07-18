package com.atul;

import java.util.Scanner;

class Node{
	int key;
	Node1 left;
	Node1 right;
	public Node(int item){
		key = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node1 root;
	BinaryTree(int item){
		root = new Node1(item);
	}
	BinaryTree(){
		root = null;
	}
	
	void insertItemToTree(int item){
		
	}
	

	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();
		BinaryTree1 bt = new BinaryTree1(item);
		bt.root.left = new Node1(2);
		bt.root.right = new Node1(3);
		
	}

}
