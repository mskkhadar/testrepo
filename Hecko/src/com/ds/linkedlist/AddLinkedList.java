package com.ds.linkedlist;

import java.util.Scanner;

public class AddLinkedList {
	class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data=data;
			this.next = null;
		}
	}
	 public static Node insert(Node head,int data) {
	        if(head==null){
	            return new AddLinkedList().new Node(data);
	        }
	        Node newNode= new AddLinkedList().new Node(data);
	         if(head.next==null) {
	        	 head.next=newNode;
	         }else {
	        	 insert(head.next,data);
	         }
	        return head;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
