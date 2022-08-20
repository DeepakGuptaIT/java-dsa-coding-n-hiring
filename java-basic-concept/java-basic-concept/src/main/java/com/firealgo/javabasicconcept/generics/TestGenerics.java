package com.firealgo.javabasicconcept.generics;

interface F<U,V> {
	V apply(U u);
}
class C implements F<String,Integer> {

	@Override
	public Integer apply(String u) {
		// TODO Auto-generated method stub
		return u.length();
	}
	
}
class Gen<X,Y> {
	String s;
	X x;
	Y y;
	public Gen(X x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Gen() {
		super();
	}
	public Y add(X x,Y y) {
		return y;
	}
	public <T> T show(X x) {
		System.out.println("hi jaan " + x);
		T t = null;
		return t;
	}
	
}

public class TestGenerics {

	public static void main(String[] args) {
		Gen<String, Integer> g = new Gen<String, Integer>();
		g.s = "hello";
		System.out.println(g.s);
		g.x = "hi";
		g.y = 5;
		//g.x = 7;
		System.out.println(g.add("hi", 5));
		/*C c = new C();
		System.out.println(c.apply("hi"));*/
		g.show("margo");

	}

}
