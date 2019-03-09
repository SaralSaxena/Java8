package com.Predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
//BiPredicate is a functional interface which accepts two argument and returns Boolean value. 
//Apply business logic for the values passed as an argument and return the boolean value.
//BiPredicate functional method is test(Object, Object). Find the simple example for how to use BiPredicate.
	
	public static void main(String[] args) {
		BiPredicate<String, String> predicate = (s1, s2) -> (s1.equals(s2));

		System.out.println(predicate.test("SARAL", "SARAL"));
		System.out.println(predicate.test("JAVA", "SARAL"));
		
		System.out.println("***************");
		
		  BiPredicate<Integer, String> condition = (i,s)-> i>20 && s.startsWith("S");
	      System.out.println(condition.test(10,"yut"));
	      System.out.println(condition.test(30,"gty"));
	      System.out.println(condition.test(30,"Saral"));

	}
}
