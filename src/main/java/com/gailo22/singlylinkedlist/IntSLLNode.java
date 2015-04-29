package com.gailo22.singlylinkedlist;

public class IntSLLNode {
	
	int value;
	IntSLLNode next;
	
	IntSLLNode(int i) {
		value = i;
	}
	
	IntSLLNode(int i, IntSLLNode n) {
		value = i;
		next = n;
	}

}
