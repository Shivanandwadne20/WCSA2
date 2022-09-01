package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageNaukari {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/profile?id=&utm_campaign=login&utm_medium=mailer&utm_source=mailerAutoLogin");
	driver.findElement(By.id("usernameField")).sendKeys("wadneshivanand@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("Rs@201119");
	driver.findElement(By.name("submit")).click();
}
}
