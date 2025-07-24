package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.CRMTestBase;

public class CoursePage extends CRMTestBase {

	@FindBy(xpath = "//span[contains(text(),'Software Testing And Automation Online Courses')]")
	WebElement homePageBannerText;

	public CoursePage() {
		PageFactory.initElements(driver, this);

	}

	public String getCoursePageTitle() {
		return driver.getTitle();
	}

}
