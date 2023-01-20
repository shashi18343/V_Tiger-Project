package testNG_PACKAGE;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.ObjectRepository.CreateOrganizationPage;
import com.crm.ObjectRepository.EditorDeleteOrganizationButtonPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.OrganizationPage;
import com.crm.ObjectRepository.RecycleBinpage;

@Listeners(com.crm.GenericUtility.ListenerImplementation.class)
public class OrgToRecyclebin_TS_03_TestNG extends BaseClass{
	@Test(groups = "integration")
	public void recycleBin() throws Throwable
	{
		


	
	//read data from excel sheet//
	String orgname = eLib.readDataFromExcelSheet("Organization1", 0, 1)+jLib.getRandom();
	String industryValue = eLib.readDataFromExcelSheet("Organization1", 1, 1);
	String typeValue = eLib.readDataFromExcelSheet("Organization1", 2, 1);
	String InDD = eLib.readDataFromExcelSheet("Organization1", 3, 1);
			
	

	
	//click on organization Module//
	HomePage hp=new HomePage(driver);
	hp.clickOnOrganization();
	
	//click on plus icon//
	OrganizationPage op=new OrganizationPage(driver);
	op.getCreateOrganizationPage();
	
	//create organization//
	CreateOrganizationPage cop=new CreateOrganizationPage(driver);
	cop.createOrganizations(orgname, typeValue, wLib, industryValue);
	
	//deleted organization//
	EditorDeleteOrganizationButtonPage e=new EditorDeleteOrganizationButtonPage(driver);
	e.clickOnDelete(wLib, driver);
	Assert.fail();
	
	//click on recycle Bin//
	hp.clickOnRecycleBin(wLib, driver);
	
	//search deleted organization name//
	RecycleBinpage rbp=new RecycleBinpage(driver);
	rbp.recycleBinPage(orgname, wLib, InDD);
	
	//signout//
	hp.clickOnSignOut(wLib, driver);
	
	//close//
	wLib.close(driver);		
	

}
	
	
}
