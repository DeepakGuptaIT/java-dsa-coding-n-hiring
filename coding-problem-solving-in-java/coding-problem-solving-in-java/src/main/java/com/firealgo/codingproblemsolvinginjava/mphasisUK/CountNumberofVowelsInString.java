package com.firealgo.codingproblemsolvinginjava.mphasisUK;

/**
 * Count the number of vowels present in the string.
 *
 */
public class CountNumberofVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = countVowels("Aaaabc");
		System.out.println("Vowel count is => "+ count);
		
	}

	private static int countVowels(String string) {
		int count = 0;
		char[] input = string.toLowerCase().toCharArray();
		for (char ch : input) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count = count +1;
			}
		}
		return count;
		
	}

}
