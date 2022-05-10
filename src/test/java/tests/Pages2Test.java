package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages2.Pages2;

public class Pages2Test {
	WebDriver drive;
	Pages2 obj;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darshita.shukla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj=new Pages2(drive);
	}
	@Test
	public void step_01() {
		obj.clickOriginDropdown();
		obj.clickDestinationDropdown();
		obj.clickCalendarDropdown();
		obj.clickPassengerDropdown();
		obj.clickcurrencyDropdown();
		obj.clickCheckbox();
	}
	@AfterClass
	public void close() {
		drive.quit();
	}
}
