package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.CRMTestBase;

public class HomePage extends CRMTestBase {

	// Page Factory - OR

	@FindBy(name = "name")
	WebElement userName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement userEmail;

	@FindBy(xpath = "//img[contains(@class, 'wikipedia-icon')]")
	WebElement wikiIcon;

	// Initializing the page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Action
	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean validateWikiIcon() {
		return wikiIcon.isDisplayed();
	}

}
