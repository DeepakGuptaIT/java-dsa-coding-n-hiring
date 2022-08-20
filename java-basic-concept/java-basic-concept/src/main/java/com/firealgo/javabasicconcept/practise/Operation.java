package com.firealgo.javabasicconcept.practise;

public class Operation {
	int data=50;  
	
	
	static void change(Operation operation){  
		operation.data = 100;
		  operation = null;
	}
	

	public static void main(String[] args) {
		Operation op = new Operation();  
		   System.out.println("before change "+op.data);  
		   Operation.change(op);
		   System.out.println("after change "+op.data);

	}

}
