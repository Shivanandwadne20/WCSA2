package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class FirstTestngClass {
  @Test
  public void method1()
  {
	  Reporter.log("method 1", true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("method 2", true);
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
  public void method4()
  {
Reporter.log("method 4", true);
  }
  
  @Test
  public void method5()
  {
	  Reporter.log("method 5", true);
  }
}
