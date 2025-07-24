package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.CRMTestBase;
import com.crm.qa.pages.CoursePage;
import com.crm.qa.pages.HomePage;

public class CoursePageTest extends CRMTestBase {

	HomePage homePage;
	CoursePage coursePage;

	public CoursePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		coursePage = homePage.userClickCourseBtn();

	}

	@Test
	public void verifyCoursePageTitleTest() {
		String title = coursePage.getCoursePageTitle();
		Assert.assertEquals(title, "SDET-QA: Udemy Courses", "Course Page title not matched");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
