package com.consumers;

import java.util.function.Consumer;

public class TestConsumer {
	private static int sum = 0;

	public static void main(String[] args) {
		Consumer<Integer> con = x -> sum += x;
		con.accept(4);

		con.accept(5);
		System.out.println("OUTPUT-->"+ sum);
		
	      Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
          c1.accept("java8");
	}
}