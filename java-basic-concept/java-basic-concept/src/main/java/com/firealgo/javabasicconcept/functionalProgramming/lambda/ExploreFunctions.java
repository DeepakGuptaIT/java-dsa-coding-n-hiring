package com.firealgo.javabasicconcept.functionalProgramming.lambda;

import java.util.function.BiConsumer;

public class ExploreFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testByConsumer();

	}

	private static void testByConsumer() {
		BiConsumer<String, String> biConsumer = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		BiConsumer<String, String> biConsumer2 = (x, y) -> {
			System.out.println(x + "_second");
			System.out.println(y + "_second");
		};

		biConsumer.andThen(biConsumer2).accept(" java2s.com", " tutorial");
	}

}



