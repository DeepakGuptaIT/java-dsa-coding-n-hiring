package com.firealgo.problemsolving.twoPointers;

public class IsSubSequence_392_Revise {
    public static void main(String[] args) {
        String s = "", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        if(s.length() == 0) return true;
        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if(j == s.length()) {
                return true;
            }

        }
        return false;
    }
}
