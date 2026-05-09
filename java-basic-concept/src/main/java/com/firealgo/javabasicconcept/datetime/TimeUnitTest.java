package com.firealgo.javabasicconcept.datetime;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timeUnitConversionT();
	}

	private static void timeUnitConversionT() {
		// TODO Auto-generated method stub
		TimeUnit c = TimeUnit.DAYS;
		System.out.println(c.convert(Duration.ofHours(48)));
		
	}
	
	

}
