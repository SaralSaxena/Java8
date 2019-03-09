package com.Predicate;

import com.Predicate.Apple;

class AppleWeightPredicate implements ApplePredicate{
		public boolean test(Apple apple){
			return apple.getWeight() > 150; 
		}

	

	
	}


