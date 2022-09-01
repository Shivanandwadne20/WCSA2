package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Methods {
	
	 
  @Test
  public void LoginActitime()
  {
	  Reporter.log("Login", false);
  }
  
 
 @Test
   public void method3()
 {
	  int a=10;
	  int b=0;
	  int res=a/b;
	  Reporter.log("method 3", true);
	  
  }
 
 @Test
 public void LogoutActitime()
 {
	  Reporter.log("Logout", false);
 }

}
