package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorrectUsername {
	WebDriver drive;

	By message = By.xpath("//div[@id='flash']");
	By logout=By.xpath("//a[@class='button secondary radius']");

	public CorrectUsername(WebDriver drive) {
		this.drive = drive;
	}

	public String correctUsernameMessage() {
		return drive.findElement(message).getText();
	}
	
	public void logout() {
		drive.findElement(logout).click();
	}
}
