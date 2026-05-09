package com.firealgo.javabasicconcept.functionalProgramming.collectors;



import com.firealgo.javabasicconcept.constant.Constants;
import com.firealgo.javabasicconcept.dao.EnitityDaoImpl;
import com.firealgo.javabasicconcept.vo.Emp;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class CollectorsTestRevise {
	static List<Emp> emps = EnitityDaoImpl.getAllEmp();

	public static void main(String[] args) {
//		accumulateNameIntoList();
//		groupBywithMappingAndFilter();
//		maxSalaryByGender();
		toMap();
	}

	private static void toMap() {
		// TODO Auto-generated method stub
		Map<Long, Emp> map = emps.stream().collect(Collectors.toMap(Emp::getId, Function.identity(), (s, a) -> s));
		System.out.println("--------toMap -" + map);

	}

	private static void maxSalaryByGender() {
		// TODO Auto-generated method stub
		System.out.println("--------maxSalaryByGender -");
		Map<Constants.Gender, String> map = emps.stream().collect(Collectors.groupingBy(Emp::getGender,
				Collectors.reducing("", Emp::getLastName, BinaryOperator.minBy(Comparator.comparing(String::length)))));
		System.out.println("--------maxSalaryByGender -" + map);

	}

	private static void groupBywithMappingAndFilter() {
		// TODO Auto-generated method stub
		System.out.println("--------groupBywithMappingAndFilter -");
		Map<Constants.Gender, Set<String>> map = emps.stream().collect(Collectors.groupingBy(Emp::getGender,
				Collectors.mapping(Emp::getFirstName, Collectors.toCollection(TreeSet::new))));
		System.out.println("--------group empName by gender,  -" + map);
		Map<Constants.Gender, Set<Emp>> map2 = emps.stream().collect(Collectors.groupingBy(Emp::getGender,
				Collectors.filtering(e -> e.getSalary() >= 0l, Collectors.toSet())));
		System.out.println("--------filter empName by id,  -" + map2);

	}

	private static void accumulateNameIntoList() {
		// TODO Auto-generated method stub
		System.out.println("--------accumulateNameIntoList -");
		Set<String> nameList = emps.stream().map(Emp::getLastName).map(String::toUpperCase)
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(nameList);
		String names = emps.stream().map(Emp::getLastName).map(String::toUpperCase)
				.collect(Collectors.joining(", ", ";", "#"));
		System.out.println("names = " + names);
	}

}
