package com.atul;

import java.util.Scanner;

public class SwapNodesInLnkedList {
	Nodes head;
	//Input:  10->15->12->13->20->14,  x = 12, y = 20
    //Output: 10->15->20->13->12->14
	
	class Nodes{
		int data;
		Nodes next;
		Nodes(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public Nodes addnewNode(int data){
		Nodes newNode;
		if (this.head == null){
			newNode = new Nodes(data);
			head= newNode;
		}
		
		else {
			newNode = new Nodes(data);
			Nodes last = head;
			while(last.next!=null){
				last = last.next;
			}
			last.next = newNode;
			last=newNode;
		}
		return newNode;

	}
	
	public void printList(){
		Nodes tmp;
		if(head==null){
			System.out.println("there is no nodes in the list");
		}
		else{
		tmp=head;
		while(tmp.next!=null){
		System.out.println(tmp.data);
		tmp=tmp.next;
			}
		System.out.println(tmp.data);

		}
	}
	
	public void swapNodes(int data1, int data2){
		
	}

	public static void main(String[] args) {
		SwapNodesInLnkedList snl = new SwapNodesInLnkedList();
		int options;
		Scanner sc  = new Scanner(System.in);
		do{System.out.println("please select from the below optins");
		System.out.println("1) to add new node");
		System.out.println("2)to print the linked list");
		options = sc.nextInt();
		switch(options){
			case 1:  {
				System.out.println("enter the element to add to linkedList at last");
				int data = sc.nextInt();
				snl.addnewNode(data);
				break;
			}
			case 2: {
				snl.printList();
				break;
			}
			case 3: {
				System.exit(0);
				break;
			}
			}
	}while(options!=3);

}
}
