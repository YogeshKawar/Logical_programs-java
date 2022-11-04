package HMSTest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HMSBase.HMSBaseClass;
import HMSPOM.HomePage;
import HMSPOM.LoginPage;
import HMSPOM.addDoctorPage;
import HMSUtility.HMSUtilityClass;

public class HMSTestClass extends HMSBaseClass{
	LoginPage login;
	HomePage home;
	addDoctorPage doctor;
@BeforeClass
public void browserSetup() {
	initilizeBrowser();
	login = new LoginPage(driver);
	home = new HomePage(driver);
}
@BeforeMethod
public void homePage() throws Throwable {
	login.list();
	login.user(HMSUtilityClass.getTD(0, 2));
	login.pass(HMSUtilityClass.getTD(0, 3));
	login.clickLogin();
	home.doctorModule();
	doctor.doctorModule1();
	doctor.enterData();
	doctor.doctorList();
	doctor.clickOnSumbitBtn();
}

@Test
public void verify() {
	home.verifyLogin();
	Reporter.log("User is on Homepage",true);
}

@Test
public void addDoctor() {
}
@AfterMethod
public void appClosed() {
	Reporter.log("app closed",true);
}
@AfterClass
public void teardown() throws Throwable {
	Thread.sleep(5000);
	driver.quit();
	Reporter.log("Driver closed",true);
}
}
