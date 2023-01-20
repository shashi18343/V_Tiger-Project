package testNG_PACKAGE;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.ObjectRepository.CreateFaqPage;
import com.crm.ObjectRepository.CreateNewProduct_Page;
import com.crm.ObjectRepository.FaqPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.ProductPage;


@Listeners(com.crm.GenericUtility.ListenerImplementation.class)
public class CreateProducts_TS_04_TestNG extends BaseClass{

@Test(groups = "integration")
public void createProduct() throws Throwable

{
		String pname = eLib.readDataFromExcelSheet("product1", 1, 0)+jLib.getRandom();
		String faqStatus = eLib.readDataFromExcelSheet("product1", 4, 1);
		String faqQuestion = eLib.readDataFromExcelSheet("product1", 5, 1);
		String faqAnswer = eLib.readDataFromExcelSheet("product1", 6, 1);
	
		//click on products//
		HomePage hp=new HomePage(driver);
		hp.clickOnProductsClick();
		
		//product page//
		ProductPage pp=new ProductPage(driver);
		pp.getProductpage();
		
		//fill the manadatory fields//
		CreateNewProduct_Page cnp=new CreateNewProduct_Page(driver);
		cnp.createProductName(pname);
		
		//click on FAQ//
		hp.clickOnFaq(wLib, driver);
		
		//click on faq plus icon//
		FaqPage fp=new FaqPage(driver);
		fp.createFaq();
		
		//fill all the manadatory fileds//
		
		CreateFaqPage cf=new CreateFaqPage(driver);
		cf.fillFaqFields(faqQuestion, faqAnswer, wLib, faqStatus, driver, pname);
		Assert.fail();
		hp.clickOnHome();
		
//		hp.clickOnSignOut(wLib, driver);
//		wLib.close(driver);

	}
}
