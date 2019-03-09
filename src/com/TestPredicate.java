package com.Predicate;

import java.util.function.Predicate;

public class TestPredicate {
  
	
//	The program in Listing 3-2 demonstrates. The first time the result method is called,
//	Predicate p's test method checks if arg is equal to 5. The second time result is
//	called, Predicate p's test method checks if arg is even.
	
	public static void result(Predicate<Integer> p, Integer arg) {
		if (p.test(arg))
			System.out.println("The Predicate is true for " + arg);
		else
			System.out.println("The Predicate is false for " + arg);
	}

	public static void main(String[] args) {
		Predicate<Integer> p1 = x -> x == 5;
		result(p1, 5);
		result(y -> y % 2 == 0, 5);
	}   
}
