package com.linkedlist.doubly;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void displayList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public static Node convertArr(int[] arr) {
		Node head = new Node(arr[0], null, null);
		Node prev = head;

		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}

	public static Node deleteAtHead(Node head) {
		Node prev = head;
		head = head.next;
		prev.next = null;
		return head;
	}

	public static Node insertAtHead(Node head, int val) {
		Node newNode = new Node(val, head, null);
		return newNode;
	}

	public static Node deleteAtTail(Node head) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node prev = temp.prev;
		temp.prev = null;
		prev.next = null;

		return head;
	}

	public static Node insertAtTail(Node head, int val) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(val, null, temp);
		temp.next = newNode;
		return head;
	}

	public static Node deleteAtK(Node head, int k) {

		Node temp = head;
		int cnt = 0;
		while (temp.next != null) {
			cnt++;
			if (cnt == k)
				break;
			temp = temp.next;
		}
		Node prev = temp.prev;
		Node front = temp.next;

		if (prev == null && front == null) {
			return null;
		} else if (prev == null) {
			return deleteAtHead(head);
		} else if (front == null) {
			return deleteAtTail(head);
		} else {
			prev.next = front;
			front.prev = prev;
			temp.next = null;
			temp.prev = null;
			return head;
		}
	}

	public static Node insertAtK(Node head, int k, int val) {
		Node temp=head;
		int cnt=0;
		while(temp!=null) {
			cnt++;
			if(k-1==cnt) break;
			temp=temp.next;
		}
		
		Node front=temp.next;
		Node newNode=new Node(val, front, temp);
		temp.next=newNode;
		front.prev=newNode;
		
		return head;
	}

	public static Node reverseLLBrute(Node head) {
		Deque<Integer> stack = new ArrayDeque<>();
		Node temp = head;

		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}

		temp = head;
		while (temp != null) {
			temp.data = stack.pop();
			temp = temp.next;
		}

		return head;
	}

	public static Node reverseLL(Node head) {
		Node current=head;
		Node last=null;
		
		while(current!=null) {
			last=current.prev;
			current.prev=current.next;
			current.next=last;
			head=current;
			current=current.prev;
		}
		
		
		return head;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 30, 40, 50, 60, 70 };
		Node head = convertArr(arr);
//		Node newNode=deleteAtHead(head);
//		Node newNode=insertAtHead(head, 100);
//		Node newNode=deleteAtTail(head);
//		Node newNode = insertAtTail(head, 100);
//		Node newNode=deleteAtK(head, 3);
//		Node newNode=insertAtK(head, 3, 100);
//		Node reverseNode=reverseLLBrute(head);
		Node reverseNode = reverseLL(head);
		displayList(reverseNode);
	}
}
