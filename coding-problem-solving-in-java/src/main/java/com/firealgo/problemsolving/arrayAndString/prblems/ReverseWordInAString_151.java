package com.firealgo.problemsolving.arrayAndString.prblems;

public class ReverseWordInAString_151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));//blue is sky the
    }

    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        var sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
