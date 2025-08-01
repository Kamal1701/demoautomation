package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.CRMTestBase;

public class HomePage extends CRMTestBase {

	// Page Factory - OR

	@FindBy(id = "name")
	WebElement userName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement userEmail;

	@FindBy(xpath = "//img[contains(@class, 'wikipedia-icon')]")
	WebElement wikiIcon;

	@FindBy(xpath = "//a[contains(text(),'Udemy Courses')]")
	WebElement udemyCourseBtn;

	// Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Action
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean validateWikiIcon() {
		return wikiIcon.isDisplayed();
	}

	public void inputUserName(String un) {
		userName.sendKeys(un);
//		userName.sendKeys(pwd);
//		coursePage.click();

	}

	public CoursePage userClickCourseBtn() {
		udemyCourseBtn.click();
		return new CoursePage();
	}
}
