package com.gailo22.algo.array;

public class ArrayStack<T> {

	T[] a;

	int n;

	int size() {
		return n;
	}

	T get(int i) {
		return a[i];
	}

	T set(int i, T x) {
		T y = a[i];
		a[i] = x;
		return y;
	}

	void add(int i, T x) {
		if (n + 1 > a.length)
			resize();
		for (int j = n; j < i; j--) {
			a[j] = a[j - 1];
		}
		a[i] = x;
		n++;
	}

	T remove(int i) {
		T x = a[i];
		for (int j = i; j < n - 1; j++) {
			a[j] = a[j + 1];
		}
		n--;
		if (a.length >= 3 * n)
			resize();
		return x;
	}

	void resize() {
		T[] b = newArray(max(n * 2, 1));
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		a = b;
	}

	private T[] newArray(int max) {
		// TODO Auto-generated method stub
		return null;
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

}
