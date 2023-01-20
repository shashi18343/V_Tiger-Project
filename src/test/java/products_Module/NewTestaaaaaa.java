package products_Module;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTestaaaaaa {
	
	@BeforeMethod
	public void method1()
	{
		Reporter.log("method1",true);
		
	}
	
	@BeforeMethod
	public void method2()
	{
		Reporter.log("method2",true);
		
	}
	
  @Test
  public void method3test()
	{
		Reporter.log("method3test",true);
		
	}
  @AfterMethod
  public void method4()
 	{
 		Reporter.log("method4",true);
 		
 	}
  @BeforeSuite
  public void method5()
 	{
 		Reporter.log("method5",true);
 		
 	}
  @Test
  public void method6()
 	{
 		Reporter.log("method6",true);
 		
 	}
}
