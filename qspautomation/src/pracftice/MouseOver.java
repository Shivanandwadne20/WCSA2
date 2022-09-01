package pracftice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//div[class='_xtXmba']"))).perform();
	
	}

}