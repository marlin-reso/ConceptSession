package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// id
		// HTML tag = <input> like that
		// Chrome dev tool
		// DOM = element in dev tool-> document object model
		// <a> -> Anchor tag-> represent link
		// Create a WebElement + perform an action on it (click, sendkeys, getText,
		// isDisplayed)

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("123456");

		// 2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement pass = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("");
//		pass.sendKeys("");

		// 3.
//		By un = By.id("input-email");
//		By pass = By.id("input-password");
//		
//		WebElement userName = driver.findElement(un);
//		WebElement password =driver.findElement(pass);
//		
//		userName.sendKeys("");
//		password.sendKeys("");

		// 4. By locator with some utility
//		By un = By.id("input-email");
//		By pass = By.id("input-password");
//
//		getElement(un).sendKeys("abc@gmail.com");
//		getElement(pass).sendKeys("@1234");
		
		
		//5.Object repository
		By un = By.id("input-email");
		By pass = By.id("input-password");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendkeys(un, "san@gmail.com");
		eUtil.doSendkeys(pass, "@12334");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
