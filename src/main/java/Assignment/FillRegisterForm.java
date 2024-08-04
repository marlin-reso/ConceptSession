package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserSession.BrowserUtil;
import utils.ElementUtil;
import utils.StringUtil;

public class FillRegisterForm {
	

	// WebDriver driver;
	static String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.lauchURL(url);

		System.out.println(bUtil.getTitle());
		System.out.println(bUtil.getURL());

		By fistName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By contact = By.id("input-telephone");
		By pwd = By.id("input-password");
		By cnfPwd = By.id("input-confirm");

		By isSubsYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSubsNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By checkBox = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By countineBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By successMsg = By.tagName("h1");

		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendkeys(fistName, "Sanjay");
		eUtil.doSendkeys(lastName, "Giri");
		eUtil.doSendkeys(email, StringUtil.getRandomEmail());
		eUtil.doSendkeys(contact, "8987659086");
		eUtil.doSendkeys(pwd, "@124");
		eUtil.doSendkeys(cnfPwd, "@124");
		eUtil.doClick(isSubsYes);
		eUtil.doClick(checkBox);
		eUtil.doClick(countineBtn);

		String actMsg = eUtil.doGetElementText(successMsg);
		System.out.println(actMsg);

		if (actMsg.contains("Your Account Has Been Created!")) {
			System.out.println("profile created");
		} else {
			System.out.println("profile not created");
		}

		//bUtil.quiteBrowser();

	}

}
