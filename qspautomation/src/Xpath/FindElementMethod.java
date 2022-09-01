package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("bike");
driver.findElements(By.xpath("//div[@class='wM6W7d WggQGd']/class"));
Thread.sleep(3000);
    

	
}
}
