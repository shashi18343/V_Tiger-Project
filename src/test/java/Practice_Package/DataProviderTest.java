package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.GenericUtility.ExcelUtility;



public class DataProviderTest {

	@Test(dataProvider = "getData")
	public void readData(String from,String to)
	{
		System.out.println(from+"--->"+to);
	}

	
	
@DataProvider
public Object[][]getData() throws Throwable
{
	ExcelUtility eLib=new ExcelUtility();
	Object[][] value=eLib.readMultipleSetOfData("DataProvider");
	return value;
}
}
