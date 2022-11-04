package HMSPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
@FindBy(xpath = "(//select[@class='validate[required]'])[1]")private WebElement LISTBOX;
@FindBy(xpath = "(//input[@name='email'])")private WebElement USERID;
@FindBy(xpath = "(//input[@name='password'])[1]")private WebElement PASSWORD;
@FindBy(xpath = "(//button[@type='submit'])[1]")private WebElement LOGINBTN;

public LoginPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}
public void list() {
Select s = new Select(LISTBOX);
s.selectByIndex(1);
}

public void user(String UID) {
	USERID.sendKeys(UID);
}
public void pass(String PWD) {
	PASSWORD.sendKeys(PWD);
}
public void clickLogin() {
	LOGINBTN.click();
}
}