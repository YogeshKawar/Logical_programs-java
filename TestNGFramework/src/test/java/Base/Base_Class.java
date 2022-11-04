package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public WebDriver driver;
	
	public void initializeBrowser() {
		driver=WebDriverManager.chromedriver().create();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
