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
	
	public static Node deleteAtHead(Node head) {
		head=head.next;
		return head;
	}
	
	public static Node deleteAtTail(Node head) {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	
	public static Node deleteAtK(Node head, int k) {
		Node prev=null;
		Node temp=head;
		int cnt=0;
		
		while(temp!=null) {
			if(k-1==cnt) {
				if(prev!=null && prev.next!=null) {
					prev.next=prev.next.next;
					break;
				}
			}
			prev=temp;
			temp=temp.next;
			cnt++;
		}
		return head;
		
	}
	
	
	public static Node insertAtHead(Node head, int data) {
		Node newNode=new Node(data,head);
		return newNode;
	}
	
	public static Node insertAtTail(Node head, int data) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode=new Node(data);
		temp.next=newNode;
		
		return head;
	}
	
	public static Node insertAtK(Node head, int k, int data) {
		Node prev=null;
		Node temp=head;
		int cnt=0;
		while(temp!=null) {
			if(k-1==cnt) {
				if(prev!=null&&prev.next!=null) {
					Node newNode=new Node(data, prev.next);
					prev.next=newNode;
				}
			}
			prev=temp;
			temp=temp.next;
			cnt++;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50 };
		Node head=convertArr(arr);
//		Node newNode=deleteAtHead(head);
//		Node newNode=insertAtHead(head,100);
//		Node newNode=deleteAtTail(head);
//		Node newNode=insertAtTail(head,100);
//		Node newNode=deleteAtK(head, 3);
		Node newNode=insertAtK(head,3,100);
		displayNode(newNode);
		
		

	}

}
