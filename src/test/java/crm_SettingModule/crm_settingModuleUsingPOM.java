package crm_SettingModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.create_crm_workflowPage;

public class crm_settingModuleUsingPOM {

	public static void main(String[] args) throws Throwable {
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		JavaUtility jLib=new JavaUtility();
		
		 String URL = fLib.readDataFromPropertyFile("url");
		 String USERNAME = fLib.readDataFromPropertyFile("username");
		 String PASSWORD = fLib.readDataFromPropertyFile("password");
		 
		 WebDriver driver=new ChromeDriver();
		 wLib.maxiMizewindow(driver);
		 wLib.waitForPageLoad(driver);
		 driver.get(URL);
		 
		 LoginPage lp=new LoginPage(driver);
		 lp.getLoginPage(USERNAME, PASSWORD);
		 
		 create_crm_workflowPage cCrmW= new create_crm_workflowPage(driver);
		 cCrmW.mouseHoverToSetClickOnCrmSetting(driver);
		 cCrmW.createWorkflow(driver);
		 
		 cCrmW.writeDescription();
		 cCrmW.checkWorkflow(driver);
		 
		 
		 
	}

}
