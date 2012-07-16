package com.gailo22.recursive;

public class RecursiveTest {
	
	
	public static void main(String[] args) {
		doRecusive(3);
		System.out.println("===========================");
		System.out.println("------>" + fib(5));
		System.out.println("===========================");
		System.out.println(fact(5));
		System.out.println("===========================");
		System.out.println(power(3, 3));
		
	}

	private static void doRecusive(int loop) {
		System.out.println("Before Recursive => " + loop);
		if (loop > 0) {
			System.out.println("before recursive inside if : " + loop);
			doRecusive(--loop);
			System.out.println("after recursive inside if : " + loop);
		}
		System.out.println("After Recursive -> " + loop);
	}
	
	private static int fib(int which) {
		if (which <= 2)  {
			System.out.print(" => " + which + " ");
			return 1;
		} else {
			System.out.print(" ->: " + which + " ");
			return fib(which -2) + fib(which -1);
		}
	}
	
	private static int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n -1);
		}
	}
	
	private static int power(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			int subProblem = power(base, exponent -1);
			return base * subProblem;
		}
		
	}
	
	

}
