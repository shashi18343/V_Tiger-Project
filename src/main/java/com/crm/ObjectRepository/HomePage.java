package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtility.WebDriverUtility;

public class HomePage {
	
	//declaration//
	@FindBy(linkText="Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	
	@FindBy(linkText="Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText="Opportunities")
	private WebElement opportunitiesLink;
	
	@FindBy(linkText="Vendors")
	private WebElement vendorsLink;
	
	@FindBy(linkText="Recycle Bin")
	private WebElement recycleBinLink;
	
	@FindBy(linkText="FAQ")
	private WebElement faqLink;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstrator;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy(linkText="More")
	private WebElement moreLink;
	
	@FindBy(linkText="Recycle Bin")
	private WebElement recyclebinLink;
	
	@FindBy(linkText="FAQ")
	private WebElement FAQLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homelink;
	
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement vendorLookupIcon;
	
	

	//initialization//
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization//

	

	
	//Business Logic//
	public void clickOnOrganization()
	{
		organizationLink.click();
	}
	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getVendorsLink() {
		return vendorsLink;
	}

	public WebElement getRecycleBinLink() {
		return recycleBinLink;
	}

	public WebElement getFaqLink() {
		return faqLink;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public WebElement getAdminstrator() {
		return adminstrator;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getRecyclebinLink() {
		return recyclebinLink;
	}

	public WebElement getFAQLink() {
		return FAQLink;
	}

	public WebElement getHomelink() {
		return homelink;
	}

	public WebElement getVendorLookupIcon() {
		return vendorLookupIcon;
	}

	public void clickOnCampaignClick()
	{
		campaignLink.click();
	}
	public void clickOnFaqClick()
	{
		faqLink.click();
	}
	public void clickOnRecycleBinClick()
	{
		recycleBinLink.click();
	}
	public void clickOnVendorsClick()
	{
		vendorsLink.click();
	}
	public void clickOnOpportunitiesClick()
	{
		opportunitiesLink.click();
	}
	public void clickOnProductsClick()
	{
		productsLink.click();
	}
	public void clickOnLeadsClick()
	{
		leadsLink.click();
	}
	
	public void clickOnRecycleBin(WebDriverUtility wLib, WebDriver driver)
	{
		wLib.mousehover(driver,moreLink);
		recyclebinLink.click();
		
	}
	public void clickOnVendor( WebDriver driver)
	{
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.mousehover(driver,moreLink);
		vendorsLink.click();
		
		
	}
	public void clickOnSignOut(WebDriverUtility wLib, WebDriver driver)
	{
		wLib.mousehover(driver, adminstrator);
		signOut.click();
	}
	
	
	public void clickOnFaq(WebDriverUtility wLib, WebDriver driver)
	{
		wLib.mousehover(driver,moreLink);
		faqLink.click();
		
	}
	public void clickOnHome()
	{
		homelink.click();
	}
	
	public void clickVendorLookupIcon()
	{
		vendorLookupIcon.click();
	}
	
	
	

	
	
	
	

}
