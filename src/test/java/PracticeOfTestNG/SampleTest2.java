package PracticeOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest2 {
	
	
		@Test(groups = "regression")
		public void create2()
		{
			Reporter.log("test3",true);
		}
		@Test(groups = "smoke")
		public void update2()
		{
			Reporter.log("test4",true);
		}
		


}
