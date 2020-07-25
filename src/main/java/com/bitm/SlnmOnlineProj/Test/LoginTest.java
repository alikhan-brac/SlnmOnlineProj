package com.bitm.SlnmOnlineProj.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.SlnmOnlineProj.Utils.DriverManagerUtil;
import com.bitm.SlnmOnlineProj.Utils.UrlTextUtil;
import com.bitm.SlnmOnlineProj.Utils.XpathUtil;

public class LoginTest {
	public WebDriver driver=null;
	
	@Test(priority = 1)
	public void CheckPgTitle() {
		driver=DriverManagerUtil.driver;
		driver.get(UrlTextUtil.Url.baseURL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtil.TEXT.HmPgTtl);
	}
	
	@Test(dependsOnMethods ="CheckPgTitle" )
	public void logintest() {
		driver.findElement(By.name(XpathUtil.LoginModule.user_name)).sendKeys("tutorial");
		driver.findElement(By.name(XpathUtil.LoginModule.pass)).sendKeys("tutorial");
		driver.findElement(By.name(XpathUtil.LoginModule.login_btn)).click();
		
	}


}
