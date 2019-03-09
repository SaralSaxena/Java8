package com.Predicate;

import java.util.function.Predicate;

public class PredicateBasics {
	public static void main(String[] args) {

		//Predicate String 
		Predicate<String> predicateString = s -> {
			return s.equals("Hello");
		};
		
		//Predicate integer
				Predicate<Integer> predicateInt = i -> {
					return i > 0;
				};

		System.out.println(predicateString.test("Hello"));
		System.out.println(predicateString.test("Hello World"));

		
		System.out.println(predicateString.test("*************************"));


		System.out.println(predicateInt.test(5));
		System.out.println(predicateInt.test(-5));
	}

}
