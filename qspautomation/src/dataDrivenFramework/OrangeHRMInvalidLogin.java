package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Flib flib = new Flib();
		 int rc = flib.getRowCount("./data/ORANGEHRM.xlsx","INVALID");
		 
		for (int i = 1; i<=rc; i++) 
		{
			
		String username = flib.readExceldata("./data/ORANGEHRM.xlsx", "INVALID", i, 0);
		String password = flib.readExceldata("./data/ORANGEHRM.xlsx", "INVALID", i, 1);
		
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		
		 driver.findElement(By.name("txtUsername")).clear();
		
		
		}
	}
}
