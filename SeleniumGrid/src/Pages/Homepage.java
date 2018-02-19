package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SelUtil;

public class Homepage {
	public SelUtil sel = new SelUtil();
	
	@FindBy(id="lst-ib")
	WebElement test;
	

	public void test(String text) {
		sel.type(test,text);
	}
	
	

}
