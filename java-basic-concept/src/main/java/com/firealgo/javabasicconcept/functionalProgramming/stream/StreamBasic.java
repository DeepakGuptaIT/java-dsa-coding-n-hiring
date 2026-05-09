package com.firealgo.javabasicconcept.functionalProgramming.stream;

import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class StreamBasic {

	public static void main(String[] args) {
//		testPeek();
		testCollect();
//		testGenerate();

	}

	
	/**
	 * peek is used for debugging purpose mainly.
	 */
	private static void testPeek() {
		Stream.of("one", "two", "three", "four","five").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).skip(1).forEach(System.out::println);
		//System.out.println(myList);
		

	}
	private static void testReduce() {
		int ms = Stream.of(1,2,3,4,5).reduce(1, (a,b) -> a*b);
		System.out.println(ms);
	}
	private static void testCollect() {
		Set<String> sList = Stream.of("one","two","three","one").collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(sList);
		//2 usring collector
		sList = Stream.of("one","two","three","one").collect(Collectors.toSet());
	}
	private static void testMinMax() {
		Optional<String> res = Stream.of("one","two","three","one").max((a,b) -> b.compareTo(a));
		String min = res.isPresent()? res.get() : null;
		System.out.println(min);
	}
	private static void testGenerate() {
		/*Stream<Integer> iList =  Stream.generate(() -> {
			 int i =0;
			return i++;
		});
		iList.forEach(j -> System.out.println(j));*/
		 Stream.generate(new Random()::nextInt)
		    .limit(5).forEach(System.out::println);
	}

}
