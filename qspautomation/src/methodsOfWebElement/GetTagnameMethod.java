package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameMethod {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		String tagname = searchbox.getTagName();
		System.out.println(tagname);
	}

}
