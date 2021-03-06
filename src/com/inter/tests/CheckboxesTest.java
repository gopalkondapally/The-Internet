package com.inter.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inter.pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest
{
	@Test(priority = 0)
	public void HeadingTest()
	{
		CheckboxesPage chboxPage = new CheckboxesPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String pageHeading= chboxPage.getPageHeader();
		Assert.assertEquals(pageHeading, "Checkboxes");
	}
	
	@Test(priority = 1)
	public void Checkbox1Test()
	{
		CheckboxesPage chboxPage = new CheckboxesPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(!chboxPage.getCheckbox1Status())
		{
			chboxPage.selectcheckbox(1);
		}
		Assert.assertTrue(chboxPage.getCheckbox1Status(), "CheckBox 1 is not selected");
	}
	
	@Test(priority = 2)
	public void Checkbox2Test()
	{
		CheckboxesPage chboxPage = new CheckboxesPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(!chboxPage.getCheckbox2Status())
		{
			chboxPage.selectcheckbox(2);
		}
		Assert.assertTrue(chboxPage.getCheckbox2Status(), "CheckBox 1 is not selected");
	}
}