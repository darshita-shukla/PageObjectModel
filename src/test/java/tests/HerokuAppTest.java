package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import herokuappPages.Checkboxes;
import herokuappPages.CorrectUsername;
import herokuappPages.DragAndDrop;
import herokuappPages.Dropdowns;
import herokuappPages.FormAuthentication;
import herokuappPages.MainPage;

public class HerokuAppTest {
	WebDriver drive;
	MainPage obj1;
	FormAuthentication obj2;
	CorrectUsername obj3;
	Checkboxes obj4;
	DragAndDrop obj5;
	Dropdowns obj6;

	@Test
	public void step01_FormAuthentication() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1.formAuthentication();
		obj2.enterUsername("tomsmith");
		obj2.enterPassword("SuperSecretPassword!");
		obj2.submit();
		drive.manage().timeouts().implicitlyWait(3000L, TimeUnit.MILLISECONDS);
		String actual = obj3.correctUsernameMessage();
		Assert.assertTrue(actual.contains("You logged into a secure area!"));
		obj3.logout();
		obj2.enterUsername("tom");
		obj2.enterPassword("SuperSecretPassword!");
		obj2.submit();
		obj2.enterUsername("tomsmith");
		obj2.enterPassword("pass");
		obj2.submit();
	}

	@Test
	public void step02_Checkboxes() {
		obj1.checkbox();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj4.check();
		
	}
//	@Test
//	public void step03_DragAndDrop() {
//		obj5.dragA();
//	}
	
	@Test
	public void step04_Dropdowns() {
		obj1.dropdowns();
		String actual=obj6.clickOption1();
		Assert.assertEquals(actual, "Option 1");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\darshita.shukla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		drive = new ChromeDriver();
		drive.manage().window().maximize();
		obj1 = new MainPage(drive);
		obj2 = new FormAuthentication(drive);
		obj3 = new CorrectUsername(drive);
		obj4 = new Checkboxes(drive);
		obj5 = new DragAndDrop(drive);
		obj6=new Dropdowns(drive);
	}

	@BeforeMethod
	public void beforeMethod() {
		drive.get("http://the-internet.herokuapp.com/");
	}

	@AfterClass
	public void afterClass() {
		drive.quit();
	}
}
