package com.Predicate;

import com.Predicate.Apple;


public class AppleColorPredicate implements ApplePredicate{
	public boolean test(Apple apple){
		return "green".equals(apple.getColor());
	}

}
