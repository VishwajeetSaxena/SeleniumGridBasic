package Tests;

import org.testng.annotations.Test;

import Base.Base;

public class TC2 extends Base {

	@Test
	public void method1() {
		log.info("Started  Test Method:" + this.getClass().getEnclosingMethod());
		page.openPage(driver, "https:///www.google.com");
		page.homepage.test("hi");
		log.info("Finished Test Method:" + this.getClass().getEnclosingMethod());
	}

}
