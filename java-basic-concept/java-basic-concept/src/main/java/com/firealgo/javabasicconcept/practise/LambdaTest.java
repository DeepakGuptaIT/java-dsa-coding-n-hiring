package com.firealgo.javabasicconcept.practise;

interface Addition {
	int add(int x, int y);
}

public class LambdaTest {

	public static void main(String[] args) {
		// define lambda using Addition interface which is functional
		Addition addition = (x, y) -> x + y;
		int result = addition.add(5, 3);
		System.out.println(result);

	}

}
