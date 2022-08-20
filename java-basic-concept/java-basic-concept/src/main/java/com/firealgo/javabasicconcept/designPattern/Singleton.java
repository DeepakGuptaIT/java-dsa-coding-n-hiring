package com.firealgo.javabasicconcept.designPattern;

public class Singleton {

	private static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	// private constructor and other methods

}
