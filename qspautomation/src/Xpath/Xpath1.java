package Xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}
}
