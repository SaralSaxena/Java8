package com.Predicate;

//Generic predicate class

import java.util.function.Predicate;

class PredicateHelper {
	public static <T> void result(Predicate<T> p,T arg) {
		if (p.test(arg))
			System.out.println("The Predicate is true for " + arg);
		else
			System.out.println("The Predicate is false for " + arg);
	}
}