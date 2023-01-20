package PracticeOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest3 {

	@Test(groups = "smoke")
	public void create3()
	{
		Reporter.log("test5",true);
	}
	@Test(groups = {"smoke","regression"})
	public void update3()
	{
		Reporter.log("test6",true);
	}
	

}
