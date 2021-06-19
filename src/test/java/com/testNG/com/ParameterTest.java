package com.testNG.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Parameters({"name"})
	@Test
	private void empuserName(String name) {
		System.out.println("Username:"+name);
		 
		
			
		}
	}


