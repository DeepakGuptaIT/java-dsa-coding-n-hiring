package com.firealgo.problemsolving.slidingWindow;

public class FindMaxNumOfVowelsInSubStringOfGivenLength_1456 {
    public static void main(String[] args) {
        var ob = new FindMaxNumOfVowelsInSubStringOfGivenLength_1456();
        int max = ob.maxVowels("abbbaa", 3);//Output: 3
        System.out.println(max);
    }

    public int maxVowels(String s, int k) {
        String vowels = "aeiouAEIOU";
        int max = 0;
        // calculate the vowel count of first window
        char[] chars = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if(vowels.indexOf(chars[i]) != -1 ) {
                max++;
            }
        }
        // Calculate the size of other windows
        int window = max;
        for (int i = k; i < s.length(); i++) {
            if(vowels.indexOf(chars[i]) != -1 ) {
                window++;
            }
            if(vowels.indexOf(chars[i-k])!= -1) {
                window--;
            }
            max = Math.max(window, max);
        }
        return max;
    }
}
