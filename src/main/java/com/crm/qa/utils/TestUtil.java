package com.crm.qa.utils;

import com.crm.qa.base.CRMTestBase;

public class TestUtil extends CRMTestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_TIMEOUT = 10;

	// create object for this class on required testcases class, and
	// initialize it on setup function
	public void switchToFrame() {
		driver.switchTo().frame(""); // pass the frame name
	}

}
