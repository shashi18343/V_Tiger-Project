package testNG_PACKAGE;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.ObjectRepository.CreateLeadPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LeadPage;

@Listeners(com.crm.GenericUtility.ListenerImplementation.class)
public class CreateLead_TS_02_TestNG extends BaseClass {

	@Test(groups = "smoke")
	public void createLead() throws Throwable
	{
		

	
//		WebDriverUtility wLib=new WebDriverUtility();
//		ExcelUtility eLib=new ExcelUtility();
//		FileUtility fLib=new FileUtility();
//		JavaUtility jLib=new JavaUtility();
//		
//		//read data from properties file//
//		String URL = fLib.readDataFromPropertyFile("url");
//		String USERNAME = fLib.readDataFromPropertyFile("username");
//		String PASSWORD = fLib.readDataFromPropertyFile("password");
//		
//		//launch the browser//
//		WebDriver driver=new ChromeDriver();
//		wLib.maxiMizewindow(driver);
//		wLib.waitForPageLoad(driver);
//		driver.get(URL);
        //creating object for load page//
//		LoginPage lp=new LoginPage(driver);
//		lp.getLoginPage(USERNAME, PASSWORD);
		
		
		//click on lead Module//
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsClick();
		
		//click on lead module//
		LeadPage LP=new LeadPage(driver);
		LP.getCreateLeadPage();
		Assert.fail();
		//fill all the manadatory fields//
		CreateLeadPage clp=new CreateLeadPage(driver);
		clp.getmandatoryfiledsAndSave(eLib.getListWithoutRandom("Shubham", 0, 1), driver, jLib);
		
		clp.clickOnEditandSaveButton();
		
//		hp.clickOnHome();
//		hp.clickOnSignOut(wLib, driver);
//		wLib.close(driver);	

	}

}
