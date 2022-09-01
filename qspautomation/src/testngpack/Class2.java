package testngpack;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	WebDriver driver;
  @Test
  public void f() 
  {System.setProperty("geckodriver.gecko.driver","./drivers/geckodriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.google.com");
	driver.switchTo().activeElement().sendKeys("CSK");
  }
}
