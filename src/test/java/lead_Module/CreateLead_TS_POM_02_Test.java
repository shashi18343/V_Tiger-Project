package lead_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.ObjectRepository.CreateLeadPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LeadPage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class CreateLead_TS_POM_02_Test {

	public static void main(String[] args) throws Throwable {
		
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		JavaUtility jLib=new JavaUtility();
		
		//read data from properties file//
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		//launch the browser//
		WebDriver driver=new ChromeDriver();
		wLib.maxiMizewindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
        //creating object for load page//
		LoginPage lp=new LoginPage(driver);
		lp.getLoginPage(USERNAME, PASSWORD);
		
		
		//click on lead Module//
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsClick();
		
		//click on lead module//
		LeadPage LP=new LeadPage(driver);
		LP.getCreateLeadPage();
		
		//fill all the manadatory fields//
		CreateLeadPage clp=new CreateLeadPage(driver);
		clp.getmandatoryfiledsAndSave(eLib.getListWithoutRandom("Shubham", 0, 1), driver, jLib);
		
		clp.clickOnEditandSaveButton();
		
		hp.clickOnHome();
		hp.clickOnSignOut(wLib, driver);
		wLib.close(driver);	

	}

}
