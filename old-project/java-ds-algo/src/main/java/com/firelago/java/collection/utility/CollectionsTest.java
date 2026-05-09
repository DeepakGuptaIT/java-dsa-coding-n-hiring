package com.firelago.java.collection.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.firelago.dao.EnitityDaoImpl;
import com.firelago.vo.Emp;

public class CollectionsTest {
	static List<Emp> emps = EnitityDaoImpl.getAllEmp();

	public static void main(String[] args) {
//		emptyCollection();
//		sortEmps();
		basicTest();
		

	}

	private static void basicTest() {
		// TODO Auto-generated method stub
		// replace all
		List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3));
		list.add(5);
		Collections.replaceAll(list, 2, 5);
		System.out.println(list);
		
	}

	private static void sortEmps() {
//		Collections.sort(emps, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
		Collections.shuffle(emps);
		System.out.println(emps);
		
	}

	private static void emptyCollection() {
		var list = Collections.EMPTY_LIST;
//		list.add("abc");
		System.out.println("emptyList = "+list);
		
	}

}
