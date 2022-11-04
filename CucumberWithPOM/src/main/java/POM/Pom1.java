package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	//step1 Declaration
		@FindBy(xpath="//input[@id='userid']")private WebElement UNAME;
		@FindBy(xpath="//input[@id='password']")private WebElement PW;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	//step2 Initialization
		public Pom1(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//Utilization
		public void enterUN(String UN) {
			UNAME.sendKeys(UN);
		}
		public void enterPWD(String PWD) {
			PW.sendKeys(PWD);
		}
		public void clickLOGINBTN() {
			LOGINBTN.click();
		}

}
