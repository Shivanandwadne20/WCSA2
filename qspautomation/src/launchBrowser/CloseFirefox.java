package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefox {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe"); // to avoid IllegalStateException
		
		FirefoxDriver driver = new FirefoxDriver(); // to open firefox
		
		Thread.sleep(5000); // delay of 5 sec
		
		driver.close();
		
	}

}
