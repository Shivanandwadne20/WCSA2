package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class OrangeHrmAssertion
{
	WebDriver driver;
	@Test(priority = -1)
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String welcomepageTitle = driver.getTitle();
	}
	@Test
	public void assrt() throws InterruptedException
	{
		String welcomepageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(welcomepageTitle, "OrangeHRM");
		Reporter.log("Welcome Page Title Verifyed", true);	
		
		boolean usernameTextBox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(true, usernameTextBox);
		Reporter.log("Useranme text box verifyed", true);
		
		// HARD ASSERT
		boolean passwordTextBox = driver.findElement(By.name("password")).isDisplayed();
		Assert.assertEquals(true, passwordTextBox);
		Reporter.log("PASSWORD TEXT BOX VERIFIED", true);
		
	}
	@Test(priority = 2)
	public void tearUp()

	{
	   driver.quit();		

	}
}

