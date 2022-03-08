package com.qa.pageLayer;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement search_box;
	
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement search_btn;
	
	public void enterTextInSearchBox()
	{
		search_box.sendKeys("Printed dress");
	}
	
	public void clickOnSearchBtn()
	{
		search_btn.click();
	}

}
