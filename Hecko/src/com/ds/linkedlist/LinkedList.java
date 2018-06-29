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
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node n= head;
		while(n!=null) {
			System.out.print(n.data+" --> "+(n.next==null?null:"")+" ");
			n=n.next;
		}
		System.out.println();
		n=null;
	}
	public void intialize(LinkedList ls) {
		// add at head
		ls.head=new Node(10);
		Node second=new Node(20);
		Node third =new Node(30);
		ls.head.next=second;
		second.next=third;
		// add at tail
		Node four= new Node(40);
		Node temp=head;
		head=four;
		head.next=temp;
	}
	public void addAfterSpecificNode(Node afterNode,int data) {
		if(afterNode==null) {
			System.out.println("List is empty");
			return;
		}
		Node newNode=new Node(data);
		newNode.next=afterNode.next;
		afterNode.next=newNode;
	}
	
	public void deleteNodeByKey(int key) {
		if(head!=null && head.data==key) {
			head=head.next;
			return;
		}
		Node pre=null,next=head;
		while(next!=null && next.data!=key) {
			pre=next;
			next=next.next;
		}
		
		pre.next=next.next;
	}
	public void deleteNodeByPostion(int pos) {
		if(pos==1) {
			head=head.next;
			return;
		}
		Node pre=head,next=null;
		int i=2;
		while(pre!=null && i!=pos) {
			next=pre;
			pre=pre.next;
			i++;
		}
		next.next=pre.next;
	}
	public void deleteAll() {
		head=null;
	}
	public int listLenth() {
		Node temp=head;
		if(temp==null) {
			return 0;
		}
		int i=0;
		while(temp!=null) {
			i++;
			temp=temp.next;
		}
		return i;
	}
	public boolean searchKey(Node node,int data) {
		
		if(node==null) {
			return false;
		}
		if(node.data==data) {
				return true;
		}
		return searchKey(node.next, data);
		
	}
	public boolean searchKeyByIterative(Node node,int data) {
		if(node==null) {
			return false;
		}
		while(node!=null) {
			if(node.data==data)return true;
			node=node.next;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedList ls= new LinkedList();
		ls.intialize(ls);
		ls.traverse();
		System.out.println(ls.listLenth());
		System.out.println(ls.searchKey(ls.head, 20));
		ls.addAfterSpecificNode(ls.head.next, 15);
		ls.traverse();
		ls.deleteNodeByKey(15);
		ls.traverse();
		ls.deleteNodeByPostion(1);
		ls.traverse();
		ls.deleteAll();
		ls.traverse();
		
	}
	
}
