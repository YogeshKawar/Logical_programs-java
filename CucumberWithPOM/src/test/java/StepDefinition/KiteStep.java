package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Pom1;
import POM.Pom2;
import POM.Pom3;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KiteStep {
	WebDriver driver=null;
	Pom1 P1;
	Pom2 P2;
	Pom3 P3;
	@Given("Browser is open on Chrome")
	public void browser_is_open_on_chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@And("User on login1 page")
	public void user_on_login1_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://kite.zerodha.com/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_un_and_pwd(String UN, String PWD) {
		P1= new Pom1(driver);
		P1.enterUN(UN);
		P1.enterPWD(PWD);
	}

	@And("Click on login button")
	public void click_on_login_button() {
		P1= new Pom1(driver);
		P1.clickLOGINBTN();
	}

	@Then("^User navigates to login2 page and enters (.*)$")
	public void user_navigates_to_login2_page_and_enters_pin(String PIN) {
		P2= new Pom2(driver);
		P2.enterPIN(PIN);

	}

	@And("Click on continue button")
	public void click_on_continue_button() {
		P2= new Pom2(driver);
		P2.clickcntBtn();
	}

	@Then("^Verify login successfully with (.*)$")
	public void verify_login_successfully_with_userid(String USERID) {
		P3= new Pom3(driver);
		String actID = P3.verifyuserID();
		String expID = USERID;

		if(actID.equals(expID)) {
			System.out.println("TC passed, User is on Home page");
		}
		else {
			System.out.println("TC failed");
		}
	}
}
