package com.firealgo.javabasicconcept.dao;

import com.firealgo.javabasicconcept.constant.Constants;
import com.firealgo.javabasicconcept.vo.Dept;
import com.firealgo.javabasicconcept.vo.Emp;
import com.firealgo.javabasicconcept.vo.Person;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EnitityDaoImpl {
	/*
	 * private static EnitityDaoImpl instance = new EnitityDaoImpl();
	 * 
	 * public static EnitityDaoImpl getInstance() { return instance; }
	 */
	
	/**
	 * test DAO workings
	 * @param args
	 */
	public static void main(String args[]) {
//		System.out.println(getAllDept());
//		System.out.println(getDeptByName("it"));
//		System.out.println(getAllEmp());
//		System.out.println(getEmpById(2));
//		System.out.println(getEmpByFirstName("Sharad"));
//		System.out.println(getEmpByLastName("Mishra2"));
//		System.out.println(getAllPerson());
		// practise functions
		System.out.println(getEmpByGender(Constants.Gender.FEMALE));
	}
	
	private static List<Emp> getEmpByGender(Constants.Gender gender) {
		List<Emp> emp = getAllEmp().stream().filter(e -> e.getGender() == gender).collect(Collectors.toList());
		return emp;
	}

	public static List<Dept> getAllDept() {
		List<Dept> depts = new ArrayList<>(Arrays.asList(
				new Dept("CSE", 10, true, LocalDateTime.now().minusDays(1), 10L),
				new Dept("IT", 20, true, LocalDateTime.now(), 10L), new Dept("ECE", 30, true, LocalDateTime.now(), 20L),
				new Dept("MECH", 40, true, LocalDateTime.now(), 20L)));
		return depts;
	}
	/**
	 * Will return a single dept that match the name provided
	 * @param deptName
	 * @return
	 */
	public static Dept getDeptByName(String deptName) {
		Dept dept = getAllDept().stream().filter(e -> e.getName().equalsIgnoreCase(deptName)).findFirst().orElse(null);
		return dept;
	}

	public static List<Emp> getAllEmp() {
		List<Emp> emps = new ArrayList<>(Arrays.asList(
				new Emp(getDeptByName("cse"), "Sharad Mohan", 35, "Sharad", "Mohan", Constants.Gender.MALE, 2, true,
						LocalDateTime.now().minusDays(2), 15L),
				new Emp(getDeptByName("it"), "Mony Gupta", 35, "Mony", "Gupta", Constants.Gender.FEMALE, 4, true,
						LocalDateTime.now().minusDays(10), 30L),
				new Emp(getDeptByName("cse"), "Omkar Mishra", 50, "Omkar", "Mishra", Constants.Gender.MALE, 1, false,
						LocalDateTime.now().minusDays(1), 10L),
				new Emp(getDeptByName("cse"), "Deepak Kumar", 65, "Deepak", "Kumar", Constants.Gender.MALE, 3, true,
						LocalDateTime.now().minusDays(2), 15L),
				new Emp(getDeptByName("it"), "Latika Gupta", 45, "Latika", "Gupta", Constants.Gender.FEMALE, 5, true,
						LocalDateTime.now().minusDays(2), 15L),
				new Emp(getDeptByName("mech"), "Palash Sen", 35, "Palash", "Sen", Constants.Gender.MALE, 6, true,
						LocalDateTime.now().plusDays(2), 60L),
				new Emp(getDeptByName("mech"), "Palash Kumar", 90, "Palash", "Sen", Constants.Gender.MALE, 7, true,
						LocalDateTime.now().plusDays(2), 60L)
				));
		return emps;
	}
	
	public static Emp getEmpById(long id) {
		Emp emp = getAllEmp().stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		return emp;
	}
	
	public static List<Person> getAllPerson() {
		List<Person> people = getAllEmp().stream().map(e -> {
			return new Person(e.getFirstName(), e.getLastName(), e.getGender(), e.getId(), e.isActive());
		}).collect(Collectors.toList());
		return people;
	}
	
	public static Emp getEmpByFirstName(String firstName) {
		Emp emp = getAllEmp().stream().filter(e ->e.getFirstName() != null &&  e.getFirstName().equals(firstName)).findFirst().orElse(null);
		return emp;
	}
	
	public static Emp getEmpByLastName(String lastName) {
		Emp emp = getAllEmp().stream().filter(e ->e.getLastName() != null && e.getLastName().equals(lastName)).findFirst().orElse(null);
		return emp;
	}
	

}
