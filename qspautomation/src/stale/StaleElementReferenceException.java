package stale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver= new ChromeDriver();
	driver.get("http://127.0.0.1/login.do;jsessionid=1gt6jcshtksln");
	 WebElement username = driver.findElement(By.name("username"));
	WebElement pass = driver.findElement(By.name("pwd"));
	driver.navigate().refresh();
	username.sendKeys("admin");
	pass.sendKeys("manager");
	
	}

}
