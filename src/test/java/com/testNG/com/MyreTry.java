package com.testNG.com;

import java.util.concurrent.CountDownLatch;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyreTry implements IRetryAnalyzer {
	 
	int i=1;
	int limit=3;

	
	
	
	@Override
	public boolean retry(ITestResult result) {
	
		if(i<=limit) {
			i++;
			return true;
		}
		
		return false;
	}
	

}
