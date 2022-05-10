package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pages2 {
	WebDriver drive;
	@FindBy(id = "ctl00_mainContent_DropDownListCurrency")
	WebElement currencyDropdown;

	@FindBy(id = "divpaxinfo")
	WebElement passengerDropdown;
	@FindBy(id = "hrefIncAdt")
	WebElement increasePassenger;
	@FindBy(id = "btnclosepaxoption")
	WebElement closePassengerDropdown;
	@FindBy(id = "ctl00_mainContent_ddl_originStation1_CTXTaction")
	WebElement originStation;
	@FindBy(css = "a[value='DEL']")
	WebElement delhi;
	@FindBy(xpath = "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")
	WebElement destinationStation;
	@FindBy(className = "ui-state-highlight")
	WebElement selectDate;
	@FindBy(id = "ctl00_mainContent_view_date1")
	WebElement calendarDropdown;
	@FindBy(id = "ctl00_mainContent_chk_StudentDiscount")
	WebElement checkbox;

	public Pages2(WebDriver drive) {
		// TODO Auto-generated constructor stub
		this.drive = drive;
		PageFactory.initElements(drive, this);
	}

	public void clickPassengerDropdown() {
		passengerDropdown.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 4; i++) {
			increasePassenger.click();
		}
		closePassengerDropdown.click();
	}

	public void clickcurrencyDropdown() {
		currencyDropdown.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select currency = new Select(currencyDropdown);
		currency.selectByIndex(1);
	}

	public void clickOriginDropdown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		originStation.click();
		delhi.click();
	}

	public void clickDestinationDropdown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		destinationStation.click();
	}

	public void clickCalendarDropdown() {
		calendarDropdown.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDate.click();
	}

	public void clickCheckbox() {
		checkbox.click();
	}
}
