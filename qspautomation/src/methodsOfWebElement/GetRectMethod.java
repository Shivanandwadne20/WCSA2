package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement rect = driver.findElement(By.name("email"));
		Rectangle dimention = rect.getRect();
		int height = dimention.getHeight();
		int width = dimention.getWidth();
		
		System.out.println("height of username textfield= "+ height);
		System.out.println("width of username textfield "+ width);
driver.quit();
}
}
