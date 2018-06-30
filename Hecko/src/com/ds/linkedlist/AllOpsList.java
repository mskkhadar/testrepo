package com.ds.linkedlist;

import java.util.HashSet;

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
		while(last!=null && position!=i) {
			last=last.next;
			i++;
		}
		Node temp=new Node(data);
		temp.next=last.next;
		last.next=temp;
		return;
	}
	// empty list
	public void emptyList() {
		if(head!=null)head=null;
		return;
	}
	// delete element by position
	public void deleteByPostion(int position) {
		if(head==null) {
			return;
		}
		Node last=head;
		int i=1;
		while(last!=null && position!=i) {
			last=last.next;
			i++;
		}
		last.next=last.next.next;
		return;
	}
	
	// search element by itarative
	public void search(int data) {
		if(head==null)return;
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data){
				System.out.println("TRUE");return;
			}
			temp=temp.next;
		}
		System.out.println("FALSE");
	}
	// search element by recursive
	public void search_recursive(Node head,int data) {
		if(head==null) {
			System.out.println("FALSE");
			return;   
		}
		if(head.data==data) {
			System.out.println("TRUE");
			return; 
		}else {
			search_recursive(head.next,data); 
		}
	}
	
	// print elements in list
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	//get Nth element
	public void getNthElement(int position) {
		if(head==null) {
			return;
		}
		Node temp=head;
		int i=1;
		while(temp!=null && position!=i) {
			temp=temp.next;
			i++;
		}
		System.out.println(temp.data);
		
	}
	public void getMiddleValue() {
		Node slowDude=head;
		Node fastDude=head;
		if(head!=null)
		while(fastDude!=null && fastDude.next!=null) {
			slowDude=slowDude.next;
			fastDude=fastDude.next.next;
		}
		System.out.println("Mid Node Budy "+slowDude.data);
	}
	// detect loop
	public void detectLoop() {
		Node slowDude=head;
		Node fastDude=head;
		if(head!=null)
		while(slowDude!=null && fastDude!=null && fastDude.next!=null) {
			slowDude=slowDude.next;
			fastDude=fastDude.next.next;
			if(slowDude==fastDude) {
				System.out.println("Loop Detected");
				break;
			}
		}
		//System.out.println("Mid Node Budy "+slowDude.data);
	}
	
	// remove duplicates in sorted linkedlist
	public void removeDuplicates() {
		if(head==null) {
			return;
		}
		Node temp=head;
		while(temp!=null && temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}
			else{temp=temp.next;}
		}
	}
	public void removeDuplicatesUnSortedOrder() {
		if(head==null) return;
		Node temp=head,pre=null;
		HashSet<Integer> distincts=new HashSet<Integer>();
		while(temp!=null) {
			int data=temp.data;
			if(distincts.contains(data)) {
				pre.next=temp.next;
			}else {
				distincts.add(data);
				pre=temp;
			}
			temp=temp.next;
		}
	}
	// reverse linked list
	public void reverse() {
		 Node curr=head,pre=null,next=null;
		 while(curr!=null) {
			 next=curr.next;
			 curr.next=pre;
			 pre=curr;
			 curr=next;
		 }
		 head=pre;
		
	}
	public void arrEvenOddGroup() {
		Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;
         
        while(currentNode != null) {
            int element = currentNode.data;
             
            if(element % 2 == 0) {
                 
                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
                 
            } else {
                 
                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
                        // Move head pointer one step in forward direction
            currentNode = currentNode.next;    
        }
         
         
        if(oddStart == null || evenStart == null) {
            return;
        }
         
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head=evenStart;
	}
	
	Node head;
	public static void main(String[] args) {
		AllOpsList ls=new AllOpsList();
		 
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(3);
		ls.push(2);
		ls.push(2);
		
		ls.push(3);
		
		
		ls.print();
		
		ls.appendEnd(10);
		ls.appendEnd(11);
		
		ls.appendEnd(13);
		
		ls.print();
		
		ls.appendAfterPostion(2,99);
		ls.print();
		
		ls.deleteByPostion(2);
		ls.print();
		
		ls.search(5);
		ls.search(10);
		ls.search_recursive(ls.head, 9);
		ls.search_recursive(ls.head, 11);
		ls.getNthElement(3);
		ls.print();
		ls.getMiddleValue();
		//ls.head.next.next.next=ls.head;
		ls.detectLoop();
		ls.print();
		//ls.removeDuplicates();
		ls.removeDuplicatesUnSortedOrder();
		ls.print();
		ls.reverse();
		ls.print();
		ls.arrEvenOddGroup();
		ls.print();
	}
}
