package com.firealgo.javabasicconcept.functionalProgramming.collectors;



import com.firealgo.javabasicconcept.dao.EnitityDaoImpl;
import com.firealgo.javabasicconcept.vo.Dept;
import com.firealgo.javabasicconcept.vo.Emp;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class CollectorsTest {
	static List<Emp> emps = EnitityDaoImpl.getAllEmp();

	public static void main(String[] args) {
		CollectorsOperstions();
		accumulateEmpNames();
		concatEmpNames();
		summerizeEmpSalaries();
		groupEmpByDept();
		getSumOfEmpSalByDept();
		groupEmpNameByDept();
		partitionEmps();
//		 iterateList();
//		 printFullSummery();
		 getCPUCount();
//		 exploreToMapFunction();
		 testReduce();
	}
	
	private static void testReduce() {
		System.out.println("--------reduce to sum all emp sal---But,we have easier solution -");
		long total = emps.stream().map(e -> e.getSalary()).collect(Collectors.reducing(0, (e1,e2) -> e1.longValue() + e2.longValue())).longValue();
		System.out.println("sum of emp sal ="+ total);
		System.out.println("---calculate sum,avg etc in easier way !---");
		total = emps.stream().mapToLong(Emp::getSalary).sum();
		System.out.println("sum of emp sal ="+ total);
		total = emps.stream().map(Emp::getSalary).reduce(0L, (e1,e2) -> e1.longValue() + e2.longValue()).longValue();
		System.out.println(total);
		
	}

	/**
	 * partition the people into two group :by sal less than 35
	 */
	private static void partitionEmps() {
		System.out.println("---------partition the people into two group :by sal less than 35 -----");
		Map<Boolean, List<Emp>> partitionEmpBySal = emps.stream().collect(Collectors.partitioningBy(e ->e.getSalary()>35));
		System.out.println(partitionEmpBySal);
		System.out.println("---------partition the names into two group :by sal less than 35 -----");
		Map<Boolean, List<String>> partitionEmpNameBySal = emps.stream().collect(Collectors.partitioningBy(e ->e.getSalary()>35, Collectors.mapping(Emp::getFirstName, Collectors.toList())));
		System.out.println(partitionEmpNameBySal);
	}

	/**
	 * Group employeeName by dept
	 */
	private static void groupEmpNameByDept() {
		System.out.println("----------------Group employeeName in TreeSet by dept------------------");
		Map<Dept, Set<String>> empNameByDept = emps.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.mapping(Emp::getFullName, Collectors.toCollection(TreeSet::new))));
		System.out.println(empNameByDept);
	}

	/**
	 * Compute sum of salaries by department
	 */
	private static void getSumOfEmpSalByDept() {
		System.out.println("--------------Compute sum of salaries by department---------------");
		Map<Dept, Long> sumByDept = emps.stream()
				.collect(Collectors.groupingBy(Emp::getDept, Collectors.summingLong(Emp::getSalary)));
		System.out.println(sumByDept);
		
	}
	/**
	 *  Group employees by department
	 */
	private static void groupEmpByDept() {
	
		System.out.println("----------Group employees by department---------------");
		Map<Dept, List<Emp>> empByDeptGroups = emps.stream().collect(Collectors.groupingBy(Emp::getDept));
		System.out.println(empByDeptGroups);
	
}

	
	private static void summerizeEmpSalaries() {
		List<Emp> emps = EnitityDaoImpl.getAllEmp();
		//sum of all emp salary
		System.out.println("-------------sum of all emp salary---------------");
		long total = emps.stream().collect(Collectors.summingLong(Emp::getSalary));
		System.out.println(total);
		
	}

	/**
	 * Convert elements to strings and concatenate them, separated by commas
	 */
	private static void concatEmpNames() {
		List<Emp> emps = EnitityDaoImpl.getAllEmp();

		String joined = emps.stream().map(Emp::getFullName).collect(Collectors.joining(", ", "#", "#"));
		System.out.println("Convert elements to strings and concatenate them, separated by commas");
		System.out.println(joined);
	}

	/**
	 * Accumulate names into a List.
	 */
	private static void accumulateEmpNames() {
		List<Emp> emps = EnitityDaoImpl.getAllEmp();
		// accumulate into list
		System.out.println("------------accumulate into LinkedList-----------");
		LinkedList<String> names = emps.stream().map(Emp::getFullName)
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(names);
		// accumulate lastName into set
		System.out.println("-----------accumulate lastName into set----------");
		Set<String> lastNameSet = emps.stream().map(Emp::getLastName).collect(Collectors.toSet());
		System.out.println(lastNameSet);
		// accumeulate lastName to TreeSet
		System.out.println("--------accumeulate lastName to TreeSet----------");
		Set<String> lastNameTreeSet = emps.stream().map(Emp::getLastName)
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(lastNameTreeSet);

	}

	private static void CollectorsOperstions() {
		

	}

	private static void getCPUCount() {
		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool.getParallelism());
	}

}
