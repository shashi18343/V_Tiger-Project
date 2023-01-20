package organization_Module;

import com.crm.ObjectRepository.CreateOrganizationPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.OrganizationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class CreateOrg_TS_POM_01_Test {

	public static void main(String[]args) throws Throwable
	{
		
		
		
	
	
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		JavaUtility jLib=new JavaUtility();
		
		//read data from properties file//
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
	
		
		//read data from excel sheet//
		String orgname = eLib.readDataFromExcelSheet("Organization1", 0, 1);
		String industryValue = eLib.readDataFromExcelSheet("Organization1", 1, 1);
		String typeValue = eLib.readDataFromExcelSheet("Organization1", 2, 1);
		
		//launch the browser//
		
		WebDriver driver=new ChromeDriver();
		wLib.maxiMizewindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
	
        //creating object for load page//
		LoginPage lp=new LoginPage(driver);
		lp.getLoginPage(USERNAME, PASSWORD);
	
		//click on organization//
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganization();
		

		//click on create Organization//
		OrganizationPage op=new OrganizationPage(driver);
		op.getCreateOrganizationPage();
		
		//organization page//
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		//cop.createOrganization(orgname);
		cop.createOrganizations(orgname, typeValue, wLib, industryValue);
		cop.clickOnEditAndSave();
		
		
		cop.clickOnSignOutCOP(wLib, driver);
		//hp.clickOnHome();
		// wLib.close(driver);
		
	}

}
