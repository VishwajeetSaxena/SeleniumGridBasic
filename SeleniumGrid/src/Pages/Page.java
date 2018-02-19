package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.LogInit;
import Utils.SelUtil;

public class Page {
	
	
	public Homepage homepage;
	public SelUtil sel = new SelUtil();
	private LogInit logs;
	private Logger log;
	
	public Page(WebDriver driver) {
		
		logs = new LogInit();
		log = logs.initLogs();
		log.info("Driver is now in Page Class");
		
		log.info("PageFactory.initElements() static method takes :  a.) the driver instance of the given class and b.) the class type");
		log.info("PageFactory.initElements() static method returns : Page Object with its fields fully initialized");
		log.info("Now using initElements() method, all elements will get initialized of giver pages");
		homepage = PageFactory.initElements(driver, Homepage.class);
		
	}
	
	public void openPage(WebDriver  driver, String url)
	{
		sel.openUrl(driver, url);
	}
}
