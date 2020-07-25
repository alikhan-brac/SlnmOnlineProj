package com.bitm.SlnmOnlineProj.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.bitm.SlnmOnlineProj.Utils.DriverManagerUtil;
import com.bitm.SlnmOnlineProj.Utils.XpathUtil;

public class FlightFindTest {

	public WebDriver driver=null;
	
	@AfterSuite()
	public void checkFlightTitle() {
		driver=DriverManagerUtil.driver;				
	}
	
	@AfterClass
	public void FltFnTest() {
		driver.findElement(By.xpath(XpathUtil.LoginModule.one_way_sel)).click();
		//System.out.println("checking git bash status");
	}
	


}
