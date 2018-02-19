package Utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelUtil {
	
	private Logger log;
	private LogInit logs;

	public SelUtil(){
		logs = new LogInit();
		log = logs.initLogs();
		log.info("SelUtill constructor called");
	}

	
	public void type(WebElement element, String text) {
		log.info("Sending text to webElement");
		log.info("WebElement:"+element);
		log.info("Text:"+text);
		element.sendKeys(text);
	}
	
	public void openUrl(WebDriver driver, String url)
	{
		logs.log.info("Opening url: "+ url );
		driver.get(url);
	}

}