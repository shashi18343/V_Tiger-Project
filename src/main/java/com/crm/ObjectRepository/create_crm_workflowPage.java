package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.ExcelUtility;
import com.crm.GenericUtility.WebDriverUtility;

public class create_crm_workflowPage {
	
	//declaration

	@FindBy(xpath = "//img[@style='padding: 0px;padding-left:5px ']")
	private WebElement settingLogo;
	
	@FindBy(id = "mainsettings")
	private WebElement crmSetting;
	
	@FindBy(linkText = "Workflows")
	private WebElement workflowOption;
	
	@FindBy(id = "new_workflow")
	private WebElement newWorkFlowButton;
	
	@FindBy(id = "module_list")
	private WebElement createAWorkflowFor;
	
	@FindBy(id = "new_workflow_popup_save")
	private WebElement createWorkflowButton;
	
	@FindBy(id = "save_description")
	private WebElement descriptionText;
	
	@FindBy(id = "save_submit")
	private WebElement descriptionSave;
	
	@FindBy(xpath = "//a[contains(text(),'Workflows')]")
	private WebElement scrollToWorkflow;
	
	//initialization
	
	public create_crm_workflowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSettingLogo() {
		return settingLogo;
	}

	public WebElement getCrmSetting() {
		return crmSetting;
	}

	public WebElement getWorkflowOption() {
		return workflowOption;
	}

	public WebElement getNewWorkFlowButton() {
		return newWorkFlowButton;
	}

	public WebElement getCreateAWorkflowFor() {
		return createAWorkflowFor;
	}

	public WebElement getCreateWorkflowButton() {
		return createWorkflowButton;
	}

	public WebElement getDescriptionText() {
		return descriptionText;
	}

	public WebElement getDescriptionsave() {
		return descriptionSave;
	}

	public WebElement getScrollToWorkflow() {
		return scrollToWorkflow;
	}
	
	//business logic
	WebDriverUtility wLib=new WebDriverUtility();
	public void mouseHoverToSetClickOnCrmSetting(WebDriver driver)
	{
		//WebDriverUtility wLib=new WebDriverUtility();
		wLib.mousehover( driver,settingLogo );
		crmSetting.click();
	}
	
	public void createWorkflow(WebDriver driver)
	{
	wLib.scrollBarAction(driver);
	workflowOption.click();
	newWorkFlowButton.click();
	wLib.select("Leads", createAWorkflowFor);
	createWorkflowButton.click();
	
	}
	ExcelUtility eLib=new ExcelUtility();
	public void writeDescription() throws Throwable
	{
		descriptionText.sendKeys(eLib.readDataFromExcelSheet("crm_setting", 0, 1));
		//eLib.readDataFromExcelSheet("crm_setting", 0, 1);
		descriptionSave.click();
		
	}
	
	public void checkWorkflow(WebDriver driver)
	{
		wLib.scrollBarAction(driver);
		scrollToWorkflow.click();
	}
	
	
	
}
