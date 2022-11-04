package changeRegistrationDetails;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://dribbble.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='login']")).sendKeys("ssddjj2212@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sdj221293");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@class='site-nav-avatar ls-is-cached lazyloaded']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='form-btn outlined profile-action-item']")).click();
	Thread.sleep(1000);
	
	
}
}
