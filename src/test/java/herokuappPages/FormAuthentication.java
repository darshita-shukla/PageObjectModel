package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthentication {
	WebDriver drive;
	By username=By.cssSelector("#username");
	By password=By.cssSelector("#password");
	By submit=By.cssSelector(".radius");
	
	public FormAuthentication(WebDriver drive) {
		this.drive=drive;
	}
	
	public void enterUsername(String user) {
		drive.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		drive.findElement(password).sendKeys(pass);
	}
	
	public void submit() {
		drive.findElement(submit).click();
	}
}
