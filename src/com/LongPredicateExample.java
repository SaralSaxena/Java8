package com.Predicate;

import java.util.function.LongPredicate;

public class LongPredicateExample {
	 public static void main(String[] args) {
		    LongPredicate predicate = (l) -> (l > 0);
		    System.out.println(predicate.test(50));
		    System.out.println(predicate.test(-10));
		    
		    
		    System.out.println("************************");
		    
		    
		    LongPredicate predicate1 = (l) -> (l > 0);
		    LongPredicate predicate2 = (l) -> (l == 5);

		    // Using and() method
		    boolean value = predicate1.and(predicate2).test(10);
		    System.out.println(value);
		    
		    //Using or() method 
		    value=predicate1.or(predicate2).test(10);
		    System.out.println(value);
		    
		    //Using negate() method
		    value=predicate1.negate().test(10);
		    System.out.println(value);
		    
		    
		    
		  }

}
