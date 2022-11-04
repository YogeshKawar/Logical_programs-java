package ZerodhaKiteStep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KiteStep {
	WebDriver driver;
	@Given("Enter url in browser")
	public void enter_url_in_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@And("Login page gets open")
	public void login_page_gets_open() {
	   driver.get("https://kite.zerodha.com/");
	}

	@When("^User enters (.*) and (.*) and (.*)$")
	public void user_enters_dpg458_and_amol(String UN,String PWD, String PIN) {
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN,Keys.ENTER);
	}

	@Then("User should get navigated on homepage")
	public void user_should_get_navigated_on_homepage() {
	   String expID = "DPG458";
	  String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	  
	  if(expID.equals(actID)) {
		  System.out.println("User on homepage");
	  }
	  else {
		  System.out.println("Login failed");
	  }
	}
}
