package products_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.ObjectRepository.CreateFaqPage;
import com.crm.ObjectRepository.CreateNewProduct_Page;
import com.crm.ObjectRepository.FaqPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ProductPage;
import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class CreateProducts_TS_POM_04_Test {

	public static void main(String[] args) throws Throwable {
		
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		JavaUtility jLib=new JavaUtility();
		
		//read data from properties file//
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		//read data from excel sheet//
		String pname = eLib.readDataFromExcelSheet("product1", 1, 0)+jLib.getRandom();
		String faqStatus = eLib.readDataFromExcelSheet("product1", 4, 1);
		String faqQuestion = eLib.readDataFromExcelSheet("product1", 5, 1);
		String faqAnswer = eLib.readDataFromExcelSheet("product1", 6, 1);
		
		
		//launch the browser//
		WebDriver driver=new ChromeDriver();
		wLib.maxiMizewindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
        //creating object for load page//
		LoginPage lp=new LoginPage(driver);
		lp.getLoginPage(USERNAME, PASSWORD);
		
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
		
		hp.clickOnHome();
		hp.clickOnSignOut(wLib, driver);
		wLib.close(driver);

	}

}
