package com.firealgo.codingproblemsolvinginjava.mphasisUK;

/**
 * Print or return a Boolean value if vowel present in the string.- ds-done
 *
 */
public class CheckIfVowelIsPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = checkVowel("aCbc");
		if (flag)
			System.out.println("Vowel is presnt");
		else
			System.out.println("Vowel is Not Present");
	}

	private static boolean checkVowel(String string) {
		// TODO Auto-generated method stub
//		char[] vowels = {'a','e','i','o','u'};
		char[] input = string.toLowerCase().toCharArray();
		for (char ch : input) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			}
		}
		return false;
	}

}
