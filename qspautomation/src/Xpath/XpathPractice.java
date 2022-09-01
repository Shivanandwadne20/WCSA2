package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		//driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase font-weight-bold']")).click();
		//String text = driver.findElement(By.xpath("//a[@class,'webdriver' or //a,'ide' or //a,'ide']")).getText();
	   driver.findElement(By.xpath("//a[contains(@class,'webdriver')]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[contains(@class,'ide')]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[contains(@class,'ide')]"));
	  Thread.sleep(3000);
	  driver.quit();
	}

}
