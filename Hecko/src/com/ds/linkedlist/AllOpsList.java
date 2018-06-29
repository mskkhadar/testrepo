package com.ds.linkedlist;

public class AllOpsList{
	
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	// add node at front
	public void push(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		Node temp=new Node(data);
		temp.next=head;
		head=temp;
	}
	// add node after give node
	public void append(Node pre,int data) {
		if(pre==null) {
			return;
		}
		Node temp=new Node(data);
		temp.next=pre.next;
		pre.next=temp;
	}
	// add node at end
	public void appendEnd(int data){
		
		if(head==null) {
			head=new Node(data);
			return;
		}
		
		Node last=head;
		
		while(last.next!=null) {
			last=last.next;
		}
		
		last.next=new Node(data);
		
		return;
	}
	// add node at after postion
	public void appendAfterPostion(int position, int data) {
		if(head==null) {
			return;
		}
		Node last=head;
		int i=1;
		while(last!=null && position==i) {
			last=last.next;
			i++;
		}
		Node temp=new Node(data);
		temp.next=last.next;
		last.next=temp;
		return;
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	Node head;
	public static void main(String[] args) {
		AllOpsList ls=new AllOpsList();
		 
		ls.push(1);
		ls.push(2);
		ls.push(3);
		
		ls.print();
		
		ls.appendEnd(10);
		ls.appendEnd(11);
		
		ls.push(13);
		
		ls.print();
		
		ls.appendAfterPostion(2,10);
		ls.print();
	}
}
