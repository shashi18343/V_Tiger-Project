package com.crm.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	//declaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProduct;
	
	@FindBy(id = "search_txt")
	private WebElement searchTextBox;
	
	@FindBy(name = "search")
	private WebElement searchButton;
	
	
	//initialization
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//utilization
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCreateProduct() {
		return createProduct;
	}
	
	
	//business logic
	public void getProductpage()
	{
		createProduct.click();
	}
	
	public void clickSearchForCreatedVendor(WebDriver driver,String vendorname)
	{
		searchTextBox.sendKeys(vendorname);
		searchButton.click();
		driver.findElement(By.xpath("//a[.='+vendorname+']")).click();
		
	}

}
