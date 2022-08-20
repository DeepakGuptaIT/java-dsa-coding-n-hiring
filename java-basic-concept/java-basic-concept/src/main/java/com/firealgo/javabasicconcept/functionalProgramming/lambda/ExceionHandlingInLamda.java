package com.firealgo.javabasicconcept.functionalProgramming.lambda;

import java.util.function.BiConsumer;

public class ExceionHandlingInLamda {
	public static void main(String args[]) {
		int[] someNo = { 1, 2, 3, 4 };
		int key = 0;
		process(someNo, key, wrapper(
		(k, v) ->
		{ 
			System.out.println(k / v);
		}));
	}

	private static void process(int[] someNo, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNo) {
			consumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer) {
		return (k, v) -> {
			try{
				consumer.accept(k, v);//I am sending the entire lamda with what the action is passed ! And not just consumer.accept(k,v)
			}
			catch(ArithmeticException ae) {
				System.out.println("Exception caught in Lambda");
			}
		};
	}
}
