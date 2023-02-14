package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Script is going to start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Successed ");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test got failed ");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test got skipped");
	}


	public void onFinish(ITestContext context) {
		System.out.println("Test finished");
	}
	
	

}
