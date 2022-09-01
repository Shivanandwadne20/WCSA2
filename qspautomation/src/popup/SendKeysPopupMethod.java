package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysPopupMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement getprompt = driver.findElement(By.xpath("//input[@id='prompt']"));
		getprompt.click();
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("kaka wadne");
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//input[@type='text']

	}

}
