package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML%20FILES/Alert.html");
	     WebElement al = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	     al.click();
	     driver.switchTo().alert().dismiss();
	     String exce = al.getText();
	     System.out.println(exce);
	     driver.quit();
	}

}
