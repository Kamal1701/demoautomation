package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utils.TestUtil;

public class CRMTestBase {

	public static WebDriver driver;
	public static Properties props;

	public CRMTestBase() {
		try {
			props = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Kamal\\eclipse-workspace\\AutomationDemo\\src\\main\\java\\com\\crm\\"
							+ "qa\\config\\config.properties");
			props.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browserName = props.getProperty("brower");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers");
			driver = new ChromeDriver();
		}
//		else if (browserName.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Drivers");
//			driver = new FirefoxDriver();
//		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_TIMEOUT));

		driver.get(props.getProperty("url"));
	}

}
