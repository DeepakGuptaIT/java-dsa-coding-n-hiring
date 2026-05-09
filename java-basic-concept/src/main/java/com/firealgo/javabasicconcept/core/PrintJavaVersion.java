package com.firealgo.javabasicconcept.core;

public class PrintJavaVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		givenJava_whenUsingSystemProp_thenGetVersion();

	}
	public static void givenJava_whenUsingSystemProp_thenGetVersion() {
	    int expectedVersion = 8;
	    String[] versionElements = System.getProperty("java.version").split("\\.");
//	    System.out.println(Arrays.toString(versionElements));
	    int discard = Integer.parseInt(versionElements[0]);
	    int version;
	    if (discard == 1) {
	        version = Integer.parseInt(versionElements[1]);
	    } else {
	        version = discard;
	    }
//	    Assertions.assertThat(version).isEqualTo(expectedVersion);
	    System.out.println(version);
	}
}
