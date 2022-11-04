package XpathByGroupIndex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users/Dell\\Documents\\Yogesh DOC\\Software Testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
    driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
    driver.findElement(By.xpath("(//div)[13]")).click();
	Thread.sleep(5000);
	String expT = "actiTIME - Enter Time-Track";
	String actT = driver.getTitle();
	if(expT.equals(actT)) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is fail");
	}
}
}
