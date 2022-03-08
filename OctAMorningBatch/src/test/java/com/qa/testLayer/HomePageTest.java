package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class HomePageTest extends TestBase {
	
	HomePage h;
	@Test
	public void searchProductTest()
	{
		h=new HomePage();
		h.enterTextInSearchBox();
		h.clickOnSearchBtn();
	}

}
