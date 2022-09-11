package com.firealgo.dsandalgo.algo;

/**
 * https://www.youtube.com/watch?v=5dJSZLmDsxk&list=PLBZBJbE_rGRVnpitdvpdY9952IsKMDuev&index=7&ab_channel=CSDojo
 * @author uvdee
 * Note - the given matrix is sorted.
 */
public class CountNumberofNegativeNumbersInGivenSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{-3,-2,-1,1},
				{-2,2,3,4},
				{4,5,7,8}
		};
		int count = getCount(matrix, 3, 4);
		System.out.println(count);

	}

	private static int getCount(int[][] matrix, int n, int m) {
		
		int count = 0;
		// starts with right-top element
		int i=0, j=m-1;
		while(j>=0 && i< n) {
			if(matrix[i][j] <0) {
				count +=(j+1);
				i++;
			} else {
				j--;
			}
		}
		
		return count;
	}

}
