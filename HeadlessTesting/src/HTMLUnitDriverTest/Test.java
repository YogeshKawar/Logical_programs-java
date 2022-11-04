package HTMLUnitDriverTest;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;
public class Test {
public static void main(String[] args) throws Throwable {
	
	HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.BEST_SUPPORTED,true);
	
	driver.get("https://www.amazon.in/");
	String title = driver.getTitle();
	System.out.println(title);
}
}