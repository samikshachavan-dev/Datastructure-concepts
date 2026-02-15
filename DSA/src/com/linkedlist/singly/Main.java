package com.linkedlist.singly;

public class Main {

	public static Node convertArr(int[] arr) {
		Node headNode = new Node(arr[0]);
		Node mover = headNode;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover=temp;
		}
		return headNode;
	}

	public static void displayNode(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		Node head=convertArr(arr);
		displayNode(head);

	}

}
