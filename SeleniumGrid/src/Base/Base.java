package Base;


import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.Page;
import Utils.LocalDriverManager;
import Utils.LogInit;

public class Base {
	public WebDriver driver;
	public Page page;
	public LogInit logs;
	public Logger log;
	
	
	@BeforeClass
	public void initDriver() throws MalformedURLException{
		logs = new LogInit();
		log = logs.initLogs();
		
		log.info("Get driver instance with System set properties in Base");
		this.driver  =  LocalDriverManager.getDriver();
		log.info("Pass driver to page's construcer");
		page = new Page(this.driver);
	}

	
	
	@AfterClass
	public void quitDriver() throws InterruptedException {
		log.info("Driver quit");
		driver.quit();
	}
}
