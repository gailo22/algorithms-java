package com.gailo22.singlylinkedlist;

import java.util.NoSuchElementException;

public class ListStack<E> implements MyStack<E> {

	private Node<E> top;

	ListStack() {
		top = null;
	}

	public void push(E element) {
		top = new Node<E>(element, top);
	}

	public boolean isEmpty() {
		return top == null;
	}

	public E peek() {
		if (top == null)
			throw new NoSuchElementException();

		return top.data;
	}

	public E pop() {
		E element = peek();
		top = top.next;
		return element;
	}

	public String toString() {
		StringBuilder result = new StringBuilder("top [ ");
		Node<E> current = top;
		while (current != null) {
			result.append(current.data + " ");
			current = current.next;
		}
		result.append("] bottom");
		return result.toString();
	}

	private static class Node<E> {
		private E data;
		private Node<E> next;

		public Node(E element, Node<E> nextNode) {
			this.data = element;
			this.next = nextNode;
		}
	}

	public static void main(String[] args) {
		ListStack<Integer> s = new ListStack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
	}
}
