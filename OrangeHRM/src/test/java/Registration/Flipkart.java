package Registration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class = '_3704LK']")).sendKeys("OnePlus 9 Pro 5G");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]")).sendKeys("8355880584");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8898901530");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class = '_3704LK']")).clear();
	
	driver.findElement(By.xpath("//input[@class = '_3704LK']")).sendKeys("APPLE iPhone 13 Pro Max (Gold, 1 TB)");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	Thread.sleep(6000);
	
	//driver.findElement(By.xpath("//svg[text()='Add to Cart']")).click();
	
	driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();

   
	
	
}
}