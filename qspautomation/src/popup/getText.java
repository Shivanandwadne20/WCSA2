package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/HTML%20FILES/confirmation.html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		driver.quit();
		
	}

}
