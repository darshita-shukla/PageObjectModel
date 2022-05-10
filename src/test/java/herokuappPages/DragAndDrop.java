package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	WebDriver drive;
	WebElement drag_A = drive.findElement(By.xpath("//div[@id='column-a']"));
	WebElement drag_B = drive.findElement(By.xpath("//div[@id='column-b']"));

	public DragAndDrop(WebDriver drive) {
		// TODO Auto-generated constructor stub
		this.drive = drive;
	}

	public void dragA() {
		Actions builder = new Actions(drive);
		builder.dragAndDrop(drag_A, drag_B).perform();
	}
}
