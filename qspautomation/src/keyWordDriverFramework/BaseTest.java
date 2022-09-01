package keyWordDriverFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertFile(PROP_PATH, "browser");
		String url = flib.readPropertFile(PROP_PATH, "url");
		
		if (browserValue.equalsIgnoreCase("chrome"))
				{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
				}
		else if(browserValue.equalsIgnoreCase("firefox"));
		{
			System.setProperty( GECKO_VALUE, GECKO_KEY);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	

}
