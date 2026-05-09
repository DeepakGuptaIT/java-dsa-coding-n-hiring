package com.firealgo.javabasicconcept.core.string;

@SuppressWarnings("unused")
public class StringBuilderApiTest {

	public static void main(String[] args) {
		appendT();
//		deleteT();
//		deleteCharAtT();
//		replaceT();
//		insertT();
		reverseT();
		indexOfT();

	}
	private static void createSB() {
		StringBuilder sb = new StringBuilder(20);//initial capacity.16 is default
		sb = new StringBuilder("one");//capacity = 16 + str lenght passed.
		
	}
	/**
	 * 10s of variants
	 */
	private static void appendT() {
		//we can append any object ,primitive,string ,stringBuilder obj.
		StringBuilder sb = new StringBuilder();
		sb.append("I");
		sb.append(new StringBuilder(" am"));
		sb.append('g');
		sb.append(new char[] {' ','g','o','o','d'});
		sb.append(5);
		sb.append(true);
		System.out.println(sb);
	}
	/**
	 * only one variant
	 */
	private static void deleteT() {
		StringBuilder sb = new StringBuilder("happyji");
		sb.delete(2, 5);
		System.out.println(sb);
	}
	/**
	 * only one variant
	 */
	private static void deleteCharAtT() {
		StringBuilder sb = new StringBuilder("happyji");
		sb.deleteCharAt(2);
		System.out.println(sb);
	}
	/**
	 * only one variant
	 */
	private static void replaceT() {
		StringBuilder sb = new StringBuilder("happyji");
		sb.replace(2, 4, "ff");
		sb.replace(2, 10, "Ape");
		System.out.println(sb);
	}
	/**
	 * multiple variants.
	 * insert has variants like sppend method
	 * we can insert boolean ,int,str char[] etc.
	 */
	private static void insertT() {
		StringBuilder sb = new StringBuilder("happyji");
		sb.insert(2, "VIRU");
		System.out.println(sb);
	}
	
	private static void reverseT() {
		StringBuilder sb = new StringBuilder("ABC");
		sb.reverse();
		System.out.println(sb);
	}
	
	private static void indexOfT() {
		StringBuilder sb = new StringBuilder("ACBCDECDG");
		int index = sb.indexOf("CD");//3
		index = sb.lastIndexOf("CD");//6
		System.out.println(index);
	}

}
