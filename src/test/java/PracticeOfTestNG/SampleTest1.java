package PracticeOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest1 {
	@Test(groups = {"smoke","regression"})
	public void create1()
	{
		Reporter.log("test1",true);
	}
	@Test(groups = "smoke")
	public void update1()
	{
		Reporter.log("test2",true);
	}
	

}
