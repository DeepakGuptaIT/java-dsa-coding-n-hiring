package com.firealgo.javabasicconcept.functionalProgramming.lambda;

import com.firealgo.javabasicconcept.dao.EnitityDaoImpl;
import com.firealgo.javabasicconcept.vo.Person;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseWithLamda {
	public static void main(String[] args) {
		List<Person> people = EnitityDaoImpl.getAllPerson();
		// 1. sort the list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("printing all person after sorting by last name...");
		printConditionally(people, p -> true);

		// 2. print the person whose last name starts with k
		System.out.println("print the person whose lase name starts with G...");
		printConditionally(people, p -> p.getLastName().startsWith("G"));
	}
	
	/**
	 * this method is super lovely !
	 * Instead of writing multiple methods like by firstName, lastName etc.. We just defined one method
	 * @param people
	 * @param c
	 */
	private static void printConditionally(List<Person> people, Predicate<Person> c) {
		for (Person p : people) {
			if (c.test(p)) {
				System.out.println(p);
			}
		}

	}

}
