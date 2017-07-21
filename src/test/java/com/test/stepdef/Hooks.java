package com.test.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void onStart() {
		System.out.println("Hooks called");
	}
	
	@After
	public void onTearDown() {
		System.out.println("Hooks closed");
	}

}
