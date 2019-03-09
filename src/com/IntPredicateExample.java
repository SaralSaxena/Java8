package com.Predicate;

import java.util.function.IntPredicate;

public class IntPredicateExample {
	
	public static void main(String[] args) {
		IntPredicate predicate = a -> a > 0;
		System.out.println(predicate.test(5));
		System.out.println(predicate.test(-5));
		
		System.out.println("*************************************");
		
		IntPredicate predicate1 = a -> a > 0;
		IntPredicate predicate2 = a -> a == 10;

		// Using and()
		System.out.println(predicate1.and(predicate2).test(5));

		// Using or()
		System.out.println(predicate1.or(predicate2).test(12));

		// Using negate()
		System.out.println(predicate2.negate().test(10));
	}

}
