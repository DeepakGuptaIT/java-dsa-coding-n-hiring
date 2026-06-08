package com.firealgo.problemsolving._2025.aug;

import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }

    public static int longestOnes(int[] arr, int k) {
        int max=Integer.MIN_VALUE;int c=0;int v=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                q.add(i+1);
        }
        for(int i=0;i<arr.length;i++){
            c++;
            if(arr[i]==0)
            {
                v++;
            }
            if(v>k){
                c=(i+1)-q.remove();
                v--;
            }

            if(c>max)
                max=c;
        }
        return max;
    }
}
