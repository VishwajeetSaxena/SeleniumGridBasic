package Utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocalDriverManager {
	
	public static WebDriver driver;
	public static String nodeURL;
	public static WebDriver getDriver() throws MalformedURLException {
		nodeURL= "http://localhost:4444/wd/hub";
		//DesiredCapabilities caps = DesiredCapabilities.firefox();
		//caps.setBrowserName("firefox");
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), caps);
		return driver;
	}
	
}
