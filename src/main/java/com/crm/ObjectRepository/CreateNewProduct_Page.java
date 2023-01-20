package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProduct_Page {
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement prodmodule;
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createProduct;
	
	@FindBy(name="productname")
	private WebElement proname;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save;
	
	
	
	public CreateNewProduct_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProname() {
		return proname;
	}
	
	public void createProductName(String pname)
	{
		proname.sendKeys(pname);
		save.click();
	}

}
