package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 WebElement userName = driver.findElement(By.id("email"));
	Point user = userName.getLocation();
	int xaxis = user.getX();
	int yaxis = user.getY();
	System.out.println("Xaxis distance ="+ xaxis);
	System.out.println("Yaxis distance="+ yaxis);
		
	}

}
