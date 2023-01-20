package lead_Module;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Leads_Module_HC_test {

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		
//Random ran=new Random();
//int random=ran.nextInt(500);

//step 1:Get Common Data from property file
FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
Properties pObj=new Properties();
pObj.load(fis);


String URL=pObj.getProperty("url");
String USERNAME=pObj.getProperty("username");
String PASSWORD=pObj.getProperty("password");

//step 2:Read data from excel sheet
FileInputStream fi=new FileInputStream("./src/test/resources/TestData45.XLSX");
Workbook wb=WorkbookFactory.create(fi);
 Sheet sh = wb.getSheet("LeadsDetails");




WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get(URL);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//login
Thread.sleep(2000);
driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();


driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();


 WebElement mr = driver.findElement(By.name("salutationtype"));
 Select s=new Select(mr);
 s.selectByVisibleText("Mr.");
 

 
 
ArrayList<String> list = new ArrayList<String>();
list.add("firstname");
list.add("lastname");
list.add("company");
list.add("annualrevenue");
list.add("noofemployees");
list.add("phone");
list.add("email");
list.add("description");


for(int i=0;i<=sh.getLastRowNum();i++)
{
	String value=sh.getRow(i).getCell(1).getStringCellValue();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name(list.get(i))).sendKeys(value);


	}

	driver.findElement(By.xpath("(//input[@name='button'])[3]")).click();
	
	
	
	
	
	
	
	
	
	
	}
}
