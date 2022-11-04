package Registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
public static void main(String[] args) throws Throwable {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123", Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='My Info']")).click();
	WebElement name = driver.findElement(By.xpath("//input[@name='firstName']"));
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//name.sendKeys("Kiran");
//	
//	WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
//	
//
//	
//	lastName.sendKeys("Kothimbire");
	
}
}
