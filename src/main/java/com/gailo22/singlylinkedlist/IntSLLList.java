package com.gailo22.singlylinkedlist;

public class IntSLLList {
	
	IntSLLNode head, tail;
	
	IntSLLList() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToHead(int el) {
		head = new IntSLLNode(el, head);
		if (tail == null) {
			tail = head;
		}
	}
	
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		} else {
			head = tail = new IntSLLNode(el);
		}
	}
	
	public int deleteFromHead() {
		// TODO:
		return 0;
	}
	
	public int deleteFromTail() {
		// TODO:
		return 0;
	}
	
	public void printAll() {
		
	}
	
	public boolean isInList(int el) {
		// TODO:
		
		return false;
	}
	
	public void delete(int el) {
	}
	

}
