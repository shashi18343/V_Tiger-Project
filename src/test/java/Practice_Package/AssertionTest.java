package Practice_Package;

import static org.testng.Assert.assertNull;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	@Test
	public void Sample_1()
	{
		System.out.println("===TestScript-1===");
		System.out.println("===TestScript-2===");
		assertEquals("A","B");
		System.out.println("===TestScript-3===");
		System.out.println("===TestScript-4===");
	}
	
	@Test
	public void Sample_2()
	{
		System.out.println("===TestScript-5===");
		System.out.println("===TestScript-6===");
		assertNotEquals("A","B", "Script is failed");
		System.out.println("===TestScript-7===");
		System.out.println("===TestScript-8===");
	}
	
	
	@Test
	public void Sample3()
	{
		String a=null;
		assertNull(a);
		System.out.println("----");
	}
	
	
	@Test
	public void Sample_4()
	{
		System.out.println(" test 9");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("X","Y");
		System.out.println(" TEST 10 ");
		sa.assertAll();
	}
}
