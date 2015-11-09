package com.gailo22.singlylinkedlist;

import java.util.NoSuchElementException;

public class ListQueue<E> implements MyQueue<E> {

	private Node<E> front;
	private Node<E> tail;

	public ListQueue() {
		front = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void enqueue(E element) {
		Node<E> newNode = new Node<E>(element, null);
		if (front == null) {
			front = newNode;
		} else {
			tail.next = newNode;
		}

		tail = newNode;
	}

	public E peek() {
		if (front == null)
			throw new NoSuchElementException();

		return front.data;
	}

	public E dequeue() {
		E element = peek();
		front = front.next;
		if (front == null) {
			tail = null;
		}
		return element;
	}

	public String toString() {
		String result = "front [ ";
		Node<E> nodeRef = front;
		while (nodeRef != null) {
			result += nodeRef.data + " ";
			nodeRef = nodeRef.next;
		}
		return result + "] tail";
	}

	private static class Node<E> {
		private E data;
		private Node<E> next;

		public Node(E element, Node<E> nextNode) {
			data = element;
			next = nextNode;
		}
	}
}
