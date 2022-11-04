package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class actTimeStep {
	WebDriver driver;
	@Given("Browser gets open")
	public void browser_gets_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_admin_and_manager(String UN,String PWD) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN); 
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);

	}

	@And("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

	@Then("User should get navigated to homepage")
	public void user_should_get_navigated_to_homepage() {
		String expText="Enter Time-Track";
		String actText = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		if(expText.equals(actText)) {
			System.out.println("tc is pass");
		}
		else {
			System.out.println("TC is fail");
		}

	}

}
