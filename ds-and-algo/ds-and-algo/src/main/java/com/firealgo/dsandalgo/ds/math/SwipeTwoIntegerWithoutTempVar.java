package com.firealgo.dsandalgo.ds.math;

public class SwipeTwoIntegerWithoutTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; 
        int y = 6; 
        x = x + y; 
        y = x - y; 
        x = x - y; 
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y); 

	}

}
