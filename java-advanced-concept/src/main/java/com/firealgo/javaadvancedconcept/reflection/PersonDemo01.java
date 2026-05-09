package com.firealgo.javaadvancedconcept.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
public class PersonDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personDemo();
		forNameTest();

	}

	private static void forNameTest() {
		// TODO Auto-generated method stub
		try {
			Class<?> person = Class.forName("com.firealgo.javaadvancedconcept.reflection.Person");
//			person.getAge
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void personDemo() {
		Person person = new Person();
		Field[] fields = person.getClass().getDeclaredFields();
		List<String> actualFieldNames = getFieldNames(fields);
		boolean flag = Arrays.asList("name", "age")
			      .containsAll(actualFieldNames);
		System.out.println(flag);
		
		
	}
	private static List<String> getFieldNames(Field[] fields) {
	    List<String> fieldNames = new ArrayList<>();
	    for (Field field : fields)
	      fieldNames.add(field.getName());
	    return fieldNames;
	}

}
