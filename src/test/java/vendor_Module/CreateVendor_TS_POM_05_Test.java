package vendor_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.CreateVendorPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ProductPage;

public class CreateVendor_TS_POM_05_Test {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		JavaUtility jLib=new JavaUtility();
		
		//read data from properties file//
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		WebDriver driver=new ChromeDriver();
		wLib.maxiMizewindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
        //creating object for load page//
		LoginPage lp=new LoginPage(driver);
		lp.getLoginPage(USERNAME, PASSWORD);
		
	
		HomePage hp=new HomePage(driver);
		hp.clickOnVendor(driver);
		
		CreateVendorPage cvp=new CreateVendorPage(driver);
		cvp.vendorCreateNew(driver);
		
		cvp.getVendorCredentials(eLib.getList("Vendor (2)", 0, 1), driver, jLib);
		
		hp.clickOnProductsClick();
		
		ProductPage pp=new ProductPage(driver);
		pp.getProductpage();
		
		hp.clickVendorLookupIcon();
	//	pp.clickSearchForCreatedVendor(driver,vendorname);
		//hp.clickOnSignOut(wLib, driver);
		
		
	}

}
















