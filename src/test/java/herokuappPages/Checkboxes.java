package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkboxes {
	WebDriver drive;
	public By checkbox1 = By.xpath("//input[1]");
	public By checkbox2 = By.xpath("//input[2]");

	public Checkboxes(WebDriver drive) {
		this.drive = drive;
	}

	public void check() {
		drive.findElement(checkbox1).click();
		drive.findElement(checkbox2).click();
	}
}
