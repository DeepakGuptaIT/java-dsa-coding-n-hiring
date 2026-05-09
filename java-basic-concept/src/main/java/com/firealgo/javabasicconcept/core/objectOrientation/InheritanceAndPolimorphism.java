package com.firealgo.javabasicconcept.core.objectOrientation;

/**
 * Note : comiler check two types are in the same inhertance tree.
 * The compiler must allow things that might possibly work at runtime
 * 2. In overriding method, we are allowed to change the return time as long as the new return type
 * is a subclass of the declared type of the overriden(superclass) method.
 * @author uvdee
 *
 */
public class InheritanceAndPolimorphism {

	public static void main(String[] args) {
//		testCastingInInhertance();
		instanceofT();

	}

	static void testCastingInInhertance() {
		P p = new P();
		p = new C();
		//The compiler must allow that might possibly work at runtime
		C child = (C) p;//It is fine, p has reference to C in above line.
		C c = (C) new P();//RunTimeEx/
		C c2 = (C) ((P) new C2());//RunTimeEx
	}
	
	static void instanceofT() {
		P[] a= {new P(), new C(), new C2()};
		for(P p : a) {
			p.show();
			if(p instanceof C) {
				C c = (C) p;
				c.callMe();
			}
		}
	}

}

class P {
	
	P returnCurrent() {
		return new P();
	}
	
	void show() {
		System.out.println("Show: " + this.getClass().getSimpleName());
	}
}

class C extends P {
	
	C returnCurrent() {
		return new C();
	}

	void show() {
		System.out.println("Show : Overriding");
	}

	void callMe() {
		System.out.println("CallMe: " + this.getClass().getSimpleName());
	}
}

class C2 extends P {

	void show() {
		System.out.println("Show : Overriding by C2");
	}
}
