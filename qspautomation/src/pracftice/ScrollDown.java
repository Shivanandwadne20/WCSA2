package pracftice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1000)");
	}

}

