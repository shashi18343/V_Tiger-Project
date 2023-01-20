package com.crm.ObjectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.JavaUtility;

public class CreateVendorPage {

	@FindBy(xpath = "(//td[@class='tabUnSelected'])[11]")
	private WebElement moreTab;
	
	@FindBy(name = "Vendors")
	private WebElement vendorOpt;
	
	@FindBy(name = "glacct")
	private WebElement vendorSelect;
	
	@FindBy(xpath = "//img[@title='Create Vendor...']")
	private WebElement createVendor;
	
	@FindBy(name = "vendorname")
	private WebElement vendorName;
	
	@FindBy(id = "email")
	private WebElement vemailId;
	
	@FindBy(name = "category")
	private WebElement vendorCategory;
	
	@FindBy(name = "//input[@name='phone']")
	private WebElement vendorPhone;
	
	@FindBy(name = "website")
	private WebElement vendorWebsite;
	
	@FindBy(name = "street")
	private WebElement vendorStreet;
	
	@FindBy(name = "city")
	private WebElement vendorCity;
	
	@FindBy(name = "postalcode")
	private WebElement vendorPC;
	
	@FindBy(name = "pobox")
	private WebElement vendorPostBox;
	
	@FindBy(name = "state")
	private WebElement vendorState;
	
	@FindBy(name = "country")
	private WebElement vendorCountry;
	
	@FindBy(name = "description")
	private WebElement vendorDescription;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement vendorSave;
	
	public CreateVendorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMoreTab() {
		return moreTab;
	}

	public WebElement getVendorOpt() {
		return vendorOpt;
	}

	public WebElement getVendorSelect() {
		return vendorSelect;
	}

	public WebElement getCreateVendor() {
		return createVendor;
	}

	public WebElement getVendorName() {
		return vendorName;
	}

	public WebElement getVemailId() {
		return vemailId;
	}

	public WebElement getVendorCategory() {
		return vendorCategory;
	}

	public WebElement getVendorPhone() {
		return vendorPhone;
	}

	public WebElement getVendorWebsite() {
		return vendorWebsite;
	}

	public WebElement getVendorStreet() {
		return vendorStreet;
	}

	public WebElement getVendorCity() {
		return vendorCity;
	}

	public WebElement getVendorPC() {
		return vendorPC;
	}

	public WebElement getVendorPostBox() {
		return vendorPostBox;
	}

	public WebElement getVendorState() {
		return vendorState;
	}

	public WebElement getVendorCountry() {
		return vendorCountry;
	}

	public WebElement getVendorDescription() {
		return vendorDescription;
	}

	public WebElement getVendorSave() {
		return vendorSave;
	}
	
	//bussiness logic
	public void clickonMoreTab()
	{
		moreTab.click();	
	}
	
	public void vendorCreateNew(WebDriver driver)
	{
		createVendor.click();
	}

	
//	public void getVendorCredentials(String vname,String email,String phone,String website)
//	{
//		vendorName.sendKeys(vname);
//		vemailId.sendKeys(email);
//		vendorPhone.sendKeys(phone);
//		vendorWebsite.sendKeys(website);
//		vendorSave.click();
//		
//	}
	public void getVendorCredentials(HashMap<String, String> fields, WebDriver driver, JavaUtility jLib)
	{
		for(Entry<String, String> set:fields.entrySet())
		{
			if(set.getKey().contains("vendorname"))
			{
				driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
			else
			{
				driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
			}
		}
		vendorSave.click();
	}
	
}
	
	
	
	
	















