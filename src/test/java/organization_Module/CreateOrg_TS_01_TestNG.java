package organization_Module;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.ObjectRepository.CreateOrganizationPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.OrganizationPage;
@Listeners(com.crm.GenericUtility.ListenerImplementation.class)
public class CreateOrg_TS_01_TestNG extends BaseClass{

	

		@Test(groups = "smoke")
		
			public void createOrg() throws Throwable
			{
			
			
		
		
			
			//read data from excel sheet//
			String orgname = eLib.readDataFromExcelSheet("Organization1", 0, 1);
			String industryValue = eLib.readDataFromExcelSheet("Organization1", 1, 1);
			String typeValue = eLib.readDataFromExcelSheet("Organization1", 2, 1);
			
			//launch the browser//
			
			//click on organization//
			HomePage hp=new HomePage(driver);
			hp.clickOnOrganization();
			Assert.fail();

			//click on create Organization//
			OrganizationPage op=new OrganizationPage(driver);
			op.getCreateOrganizationPage();
			
			//organization page//
			CreateOrganizationPage cop=new CreateOrganizationPage(driver);
			cop.createOrganizations(orgname, typeValue, wLib, industryValue);
			
			hp.clickOnSignOut(wLib, driver);
			
			
		}
}
