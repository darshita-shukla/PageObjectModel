package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver drive;
	By checkbox = By.linkText("Checkboxes");
	By drag_and_drop = By.linkText("Drag and Drop");
	By dropdown = By.linkText("Dropdown");
	By forgot_password = By.linkText("Forgot Password");
	By form_authentication = By.linkText("Form Authentication");

	public MainPage(WebDriver drive) {
		this.drive = drive;
	}

	public void formAuthentication() {
		drive.findElement(form_authentication).click();
	}

	public void checkbox() {
		drive.findElement(checkbox).click();
	}

	public void dragAndDrop() {
		drive.findElement(drag_and_drop).click();
	}

	public void dropdowns() {
		drive.findElement(dropdown).click();;
	}

	public void forgotPassword() {
		drive.findElement(forgot_password).click();
	}
}
