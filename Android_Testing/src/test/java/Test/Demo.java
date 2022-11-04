package Test;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo {
public static void main(String[] args) throws Throwable {
	File f = new File("src");
	File fs = new File(f,"ApiDemos-debug.apk");
	DesiredCapabilities dc =  new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator1");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	//driver.findElement(By.xpath(""));
}
}
