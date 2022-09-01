package windowbasedpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadwithAutoIt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1lcv5f6ejs3nu");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logo & Color Scheme')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(4000);
		
		
		
	  Actions act = new Actions(driver);
	  WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	  act.doubleClick(target).perform();
	
	}
}
