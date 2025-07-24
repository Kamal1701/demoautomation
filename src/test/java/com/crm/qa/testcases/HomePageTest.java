package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.CRMTestBase;
import com.crm.qa.pages.HomePage;

public class HomePageTest extends CRMTestBase {

	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();

	}

//	@Test(priority = 1)
//	public void homePageTitleTest() {
//		String title = homePage.validateHomePageTitle();
//		Assert.assertEquals(title, "Automation Testing Practice");
//	}
//
//	@Test(priority = 2)
//	public void homePageWikiIconTest() {
//		boolean isIconDisplayed = homePage.validateWikiIcon();
//		Assert.assertTrue(isIconDisplayed);
//	}

	@Test
	public void userClickUdemyCourseButtonTest() {
		homePage.userClickCourseBtn();
	}

//	@Test(priority = 3)
//	public void inputUserNameTest() {
//		homePage.inputUserName(props.getProperty("username"));
//	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
