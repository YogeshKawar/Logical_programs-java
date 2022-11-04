package HMSPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "//a[@class='brand']") private WebElement TEXT;
@FindBy(xpath = "(//span[text()='Doctor'])[3]")private WebElement DOCTOR;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifyLogin() {
	String str =TEXT.getText();
	System.out.println(str);
}
public void doctorModule() {
	DOCTOR.click();
}

}
