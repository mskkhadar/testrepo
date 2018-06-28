package com.ds.linkedlist;

public class LinkedList {
	 class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data=data;
			this.next = null;
		}
	}
	
	private Node head;
	
	public void traverse() {
		Node n= head;
		while(n!=null) {
			System.out.print(n.data+" --> "+(n.next==null?null:"")+" ");
			n=n.next;
		}
		System.out.println();
		n=null;
	}
	public void intialize(LinkedList ls) {
		
		ls.head=new Node(10);
		Node second=new Node(20);
		Node third =new Node(30);
		ls.head.next=second;
		second.next=third;
		
	}
	public static void main(String[] args) {
		LinkedList ls= new LinkedList();
		ls.intialize(ls);
		ls.traverse();
		
	}
	
}
