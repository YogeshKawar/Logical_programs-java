package HMSBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HMSBaseClass {
	public WebDriver driver;

	
	public void initilizeBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://localhost/HMSCI/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
}
}
