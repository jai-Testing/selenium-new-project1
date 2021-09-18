package org.testng.ex;

import org.testng.annotations.Test;

import jdk.jfr.Enabled;

public class SampleTstNG {

	
	@Test(priority = 2)
	private void tc() {
		System.out.println("test 1....");
	}
	
	@Test(priority = 2,enabled =  false)
	private void tc1() {
		System.out.println("test  ...2...");
	}
	
	@Test(invocationCount = 3)
	private void tc4() {
		System.out.println("test 3");
		
	}
	
}
