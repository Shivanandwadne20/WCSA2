package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageFlipcart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("flipcart.com");
	driver.findElement(By.tagName("autocomplete")).sendKeys("admin");
	driver.findElement(By.tagName("autocomplete")).sendKeys("admin");
}
}
