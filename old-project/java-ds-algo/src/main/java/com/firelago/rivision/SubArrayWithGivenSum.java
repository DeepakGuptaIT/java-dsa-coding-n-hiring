package com.firelago.rivision;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 7, 5 };
		int sum = 12;
		subarraySum(arr, arr.length, sum);

	}

	static void subarraySum(final int[] arr, final int n, final int sum) {
		int start = 0;int i;
		int currSum = arr[0];
		boolean isFound = false;
		for(i=1; i< n; i++) {
			
			if(currSum == sum) {
				isFound = true;
				break;
			}
			currSum +=arr[i];
			while(currSum > sum && start< i) {
				currSum = currSum - arr[start];
				start++;
			}
			
			
		}
		if(isFound) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, i)));
		}
		else {
			System.out.println("not found");
		}
		
	}

}
