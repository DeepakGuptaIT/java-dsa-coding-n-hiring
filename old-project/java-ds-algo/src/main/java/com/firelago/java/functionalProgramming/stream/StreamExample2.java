package com.firelago.java.functionalProgramming.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class StreamExample2 {

	public static void main(String args[]) {
//		creamStream();
//		intStreamM();
		primitiveStream();
		//datatypeChangeForPrimitive();
//		efficiencyAndOrderOfExecution();
	}

	private static void creamStream() {
		Stream.of("a1","a2","a3")
		.findFirst()
		.ifPresent(System.out::println);
		Stream.of(5,6,7)
		.forEach(System.out::println);
	}
	private static void intStreamM() {
		IntStream.range(1, 4)
		.forEach(System.out::println);
	}
	private static void primitiveStream() {
		Arrays.stream(new int[] {1,2,3})
		.map(n -> 2*n +1)
		.average()
		.ifPresent(System.out::println);//5
	}
	private static void datatypeChangeForPrimitive() {
		Stream.of(1.0, 2.2, 3.5)
		.mapToInt(Double::intValue)
		.mapToObj(i -> "a" + i)
		.forEach(System.out::println);
	}
	private static void efficiencyAndOrderOfExecution() {
		Stream.of("d2","a2", "b1","b3","c","a")
		.map(s -> {
			System.out.println("map: "+s);
			return s.toUpperCase();
		})
		.anyMatch(s -> {
			System.out.println("anyMatch: "+s);
			return s.startsWith("A");
		});
	}

}
