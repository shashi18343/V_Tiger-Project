package PracticeOfTestNG;

import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;

public class TrailofDependencies {
	@Test
	public void createCustomer() {
		System.out.println("created");
//		int [] arr= {1,2,3};
//		System.out.println(arr[5]);
	}
	@Test(dependsOnMethods = "deletecutomer")
	public void updatecustomer()
	{
		System.out.println("updated");
	}

		@Test
		public void deletecutomer()
		{
			System.out.println("deleted");
			int [] arr= {1,2,3};
		System.out.println(arr[5]);
		}
}
