package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserSession.BrowserUtil;
import utils.ElementUtil;

public class OpenCartLoginTest {
	WebDriver driver;
	static String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("Chrome");
		bUtil.lauchURL(url);

		System.out.println(bUtil.getTitle());
		System.out.println(bUtil.getURL());

		By un = By.id("input-email");
		By pass = By.id("input-password");

		ElementUtil eUtil = new ElementUtil(driver);

		eUtil.doSendkeys(un, "san@gmail.com");
		eUtil.doSendkeys(pass, "@123");

		driver.close();

	}

}
