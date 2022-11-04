package HMSPOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addDoctorPage {
	@FindBy(xpath = "//i[@class='icon-plus']")private WebElement ADD_DOCTOR;
	@FindBy(xpath = "(//input[@class='validate[required]'])[1]")private WebElement FIELDS;
	@FindBy(xpath = "//select[@name='department_id']")private WebElement LISTBOX;
	@FindBy(xpath = "//button[@class='btn btn-success']")private WebElement SUBMIT;
	public addDoctorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void doctorModule1() {
		ADD_DOCTOR.click();	
		}
	public void enterData() {
		FIELDS.sendKeys("Bhushan",Keys.TAB, "bhushan@mail.com",Keys.TAB,"Password@123",
				Keys.TAB,"Nashik",Keys.TAB,"1234567890");
	}
	public void doctorList() {
		Select s = new Select(LISTBOX);
		s.selectByValue("Ophthalmologists");
	}
	public void clickOnSumbitBtn() {
		SUBMIT.click();
	}
}
