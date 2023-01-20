package SystemTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.FileUtility;
import com.crm.GenericUtility.JavaUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class TC02SystemTestingWithOutHardCode {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=null;
		
		ExcelUtility eLib=new ExcelUtility();
		FileUtility fLib=new FileUtility();
		JavaUtility jLib=new JavaUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		String BROWSER = fLib.readDataFromPropertyFile("broswer");
		
		
		if(BROWSER.equals("chrome"))
		{	
			System.out.println("Chrome driver Launched Succesfully");
			driver= new ChromeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		wLib.maxiMizewindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
		
		//login to vtiger
	    driver.findElement(By.name("user_name")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.ENTER);
	    
	    //move the mouse cursor to more
	    WebElement more = driver.findElement(By.xpath("//a[text()='More']"));
	    wLib.mousehover(driver, more);
	    
	    //click on vendor
	    driver.findElement(By.linkText("Vendors")).click();
		
		

	}

}
