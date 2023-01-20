package Practice_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_DataProvider {
	
  @Test(dataProvider = "data")
  public void travel(String src,String dst,int price)
  
  {
	 System.out.println("from"+src+" ----> "+"to"+dst+ price); 
  }
  
  @DataProvider
  public Object[][] data()
  {
	  Object[][] objarr=new Object[3][3];
	  
	  objarr[0][0]="Bangalore";
	  objarr[0][1]="Mysoire";
	  objarr[0][2]=140000;
	  
	  objarr[1][0]="Mysoire";
	  objarr[1][1]="Bangalore";
	  objarr[1][2]=100000;
	  
	  objarr[2][0]="Bangalore";
	  objarr[2][1]="Kolkata";
	  objarr[2][2]=20000;
	  
	  
	return objarr;
	  
  }
}
