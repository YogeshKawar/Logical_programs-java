package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class move_To_Element {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);
	Actions act = new Actions(driver);
	
	WebElement config = driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]"));
	WebElement term = driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[5]"));
	
	act.moveToElement(config).click().moveToElement(term).click().build().perform();
	
}


}
