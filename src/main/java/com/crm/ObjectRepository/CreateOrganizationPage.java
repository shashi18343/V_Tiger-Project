package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class CreateOrganizationPage {
	
	//declaration//
	@FindBy(name="accountname")
	private WebElement organizationName;
	
	@FindBy(name="industry")
	private WebElement industryDD;
	
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "(//td[@class='genHeaderSmall'])[1]/../td[2]/img")
	private WebElement administrationButton;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutButton;
	
	@FindBy(xpath = "(//input[@title='Edit [Alt+E]'])[1]")
	private WebElement editButton;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement editSaveButton;
	
	
	//intialization//
	public CreateOrganizationPage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	
	//utilizations//
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getIndustryDD() {
		return industryDD;
	}

	public WebElement getTypeDD() {
		return typeDD;
	}
	
	
	public WebElement getEditSaveButton() {
		return editSaveButton;
	}

	

	public WebElement getAdministrationButton() {
		return administrationButton;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	

	public WebElement getEditButton() {
		return editButton;
	}

	//business logic//
	public void createOrganization(String orgname)
	{
		organizationName.sendKeys(orgname);
	}
	
	
//	
//	public void createOrganization(String orgname, WebDriverUtility wLib, String industryValue)
//	{
//		organizationName.sendKeys(orgname);
//		wLib.select(industryDD,industryValue);
//    }
//	
	
	
	public void createOrganizations(String orgname, String typeValue, WebDriverUtility wLib,String industryValue)
	{
		organizationName.sendKeys(orgname);
		wLib.select(typeDD,typeValue);
		wLib.select(industryDD, industryValue);
		saveButton.click();
    }
	
	
	public void clickOnEditAndSave()
	{
		editButton.click();
		editSaveButton.click();
	}
//	public void saveButton()
//	{
//		saveButton.click();
//	}


	public void clickOnSignOutCOP(WebDriverUtility wLib, WebDriver driver)
	{
		wLib.mousehover(driver, administrationButton);
		signOutButton.click();
		driver.close();
	}
}







