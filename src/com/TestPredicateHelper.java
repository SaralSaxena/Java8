package com.Predicate;

import java.util.function.*;
import static com.Predicate.PredicateHelper.result;

class TestPredicateHelper {
	public static void main(String[] args) {
		Predicate<Integer> p1 = x -> x > 2;
		Predicate<String> p2 = s -> s.charAt(0) == 'H';
		result(p1, 6);
		result(p2, "Hello");
	}
}