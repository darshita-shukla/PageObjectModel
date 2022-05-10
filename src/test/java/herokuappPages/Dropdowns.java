package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdowns {
	WebDriver drive;
	By dropdown = By.id("dropdown");
	By option1 = By.xpath("//option[@value='1']");

	public Dropdowns(WebDriver drive) {
		// TODO Auto-generated constructor stub
		this.drive=drive;
	}

	public String clickOption1() {
		drive.findElement(dropdown).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drive.findElement(option1).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return drive.findElement(option1).getText();
	}
}
