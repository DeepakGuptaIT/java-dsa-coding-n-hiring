package com.firealgo.javabasicconcept.collection.utility;


import java.util.Arrays;
import java.util.Spliterator;
/**
 * In this class I will explore all the methods from java.util.Arrays.
 * All methods are utility methods i.e. static methods.
 *
 */
@SuppressWarnings("unused")
public class ArraysTest {
	static int[] numArr = { 1, 9, 10, 5, 7, 9 };
	static boolean[] ba = {true,false,true};
	static boolean[] ba2 = {true,false,true};
	static int[] arr = new int[15];

	public static void main(String[] args) {
//		sortT();
//		parallelPrefixT();
//		equalsT();
//		fillT();
//		copyOfT();
//		copyOfRangeT();
//		hashCodeT();
		//sortAndBinarySearch();
		toStringT();
//		setAllT();
//		spliteratorT();
//		deepToStringT();
//		streamT();

	}
	/**
	 * sort the primitive array.like int[],char[] etc.
	 * 
	 */
	private static void sortT() {
		int[] arr = Arrays.copyOf(numArr, numArr.length);
		Arrays.sort(numArr);
		for(int i : numArr) 
			System.out.print(i + "\t");
		System.out.println();
		//below method will sort only part of the array.
		//Arrays.sort(numArr,1,4); // sort(int[] a, int fromIndex, int toIndex) 
		//from java 1.8 we have parallelsort
		Arrays.parallelSort(arr);
		for(int i : arr) 
			System.out.print(i + "\t");
		System.out.println();
		
		//3. sort array of object which extends comparable.
		String[] strArr = {"a","c","b"};
		Arrays.parallelSort(strArr);
		for(String i : strArr) 
			System.out.print(i + "\t");
		System.out.println();
		
		//4. parallel sort of aboject by passing compareter
		String[] strArr2 = {"a","c","b","a"};
		Arrays.sort(strArr2,(e1,e2)->e2.compareTo(e1));
		for(String i : strArr2) 
			System.out.print(i + "\t");
		System.out.println();
		
	}
	/**
	 * @since 1.8
	 */
	private static void parallelPrefixT() {
		int[] arr = {2, 1, 0, 3};
		Arrays.parallelPrefix(arr, (e1,e2)->e1+e2);//2	3	3	6
		for(int i : arr) 
			System.out.print(i + "\t");
		System.out.println();
		//So,the current element will be addition(as we have pass the addition function) of all prev elements with current element.
		//Note this function is also defined for all types of element array including object type.
		//ex 2 for obj type
		String[] strArr = {"a","b","c"};
		Arrays.parallelPrefix(strArr, (e1,e2) -> e1+"-"+e2);//a	a-b	a-b-c
		for(String i : strArr) 
			System.out.print(i + "\t");
		System.out.println();
	}
	
	/**
	 * signature : 
	 *  public static boolean equals(int[] a, int[] a2)
	 *  
	 */
	private static void equalsT() {
		int[] arr = {2, 1, 0, 3};
		int[] arr2 = {2, 1, 0, 3};
		boolean isEqual = Arrays.equals(arr, arr2);
		System.out.println(isEqual);//true
		System.out.println(Arrays.equals(ba, ba2));
	}

	private static void sortAndBinarySearch() {
		Arrays.sort(numArr);
		displayArrContent();
		int val = Arrays.binarySearch(numArr, 4);
		System.out.println(val);
	}
	/**
	 * Use setAll or paralletSetAll method from instead of fill .
	 * As this is new from java 1.8
	 */
	private static void fillT() {
		//Arrays.fill(arr, 5);
		//for(int i : arr) System.out.print(i + "\t");
		//1.8
		Arrays.setAll(arr, i -> 2*i+1);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void copyOfT() {
		int[] arr = {2, 1, 0, 3};
		int[] copyArr = Arrays.copyOf(arr, 7);//2	1	0	3	0	0	0
//		copyArr =Arrays.copyOf(arr, 2);//2	1
		for(int i : copyArr) 
			System.out.print(i+ "\t");
		System.out.println();
		
	}
	
	private static void copyOfRangeT() {
		int[] arr = {2, 1, 0, 3};
		int[] copyArr = Arrays.copyOfRange(arr, 1, 2);//1	0	3	0	0	0	
		System.out.println("----------------copyOfRangeT -------------------");
		for(int i : copyArr) 
			System.out.print(i+ "\t");
		System.out.println();
		
	}
	
	private static void hashCodeT() {
		int[] arr = {2, 1, 0, 3};
		long[] arr2 = {2, 1, 0, 3};
		System.out.println("----------------hashCodeT -------------------");
		int hash = Arrays.hashCode(arr);
		int hash2 = Arrays.hashCode(arr2);
		System.out.println(hash == hash2);//true
		
		
	}
	
	private static void streamT() {
		System.out.println("----------------streamT -------------------");
		Arrays.stream(numArr).sorted().forEach(System.out::println);
	}
	private static void displayArrContent() {
		for(int i : numArr) System.out.print(i + "\t");
		System.out.println();
	}
	/**
	 * Returns a string representation of the contents of the specified array. 
	 */
	private static void toStringT() {
		int[] arr = null;
		System.out.println("----------------toStringT -------------------");
		System.out.println(Arrays.toString(arr));
	}
	
	private static void deepToStringT() {
		int[][] arr2d = {{3,4},{9,2}};
		System.out.println("----------------deepToStringT -------------------");
		System.out.println(Arrays.deepToString(arr2d));
	}
	
	private static void setAllT() {
		int[] arr = {2, 1, 0, 3};
//		Arrays.setAll(arr, i -> 2*i);//[0, 2, 4, 6]
		Arrays.setAll(arr, i -> 2);//[2, 2, 2, 2]
		System.out.println("----------------setAllT -------------------");
		System.out.println(Arrays.toString(arr));
		//similarly we have parallelSetAll, which may be more faster.
	}
	/**
	 *  @since 1.8
	 * Java Spliterator is one of the four iterators � Enumeration, Iterator, ListIterator and Spliterator.
	 * {@link https://www.journaldev.com/13521/java-spliterator}
	 */
	private static void spliteratorT() {
		int[] arr = {2, 1, 0, 3};
		Spliterator<Integer> ss = Arrays.spliterator(arr);
		System.out.println("----------------spliteratorT -------------------");
		ss.forEachRemaining(i -> System.out.println(i));
	}

}

