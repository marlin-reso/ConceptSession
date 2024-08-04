package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class LocatorStrategy {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// 1. id : unique attribute : can not be duplicate
		
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("123456");
		
		
		//2. name: can be duplicate
		
//		driver.findElement(By.name("firstname")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("lastname")).sendKeys("123456");
//		
//		//3. class name: It is not unique attribute it can be duplicate
//		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
//		
//		//4. xpath: its not an attribute: address of the webelement in HTML DOM
//		//XML PATH
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("123456");
//		
		//5. css: cascaded style sheet: its not an attribute:
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("123456");
		
		//6. linkText: only for links
		//html dom: <a> -- link
		//driver.findElement(By.linkText("Login")).click();
		
//		By loginLink = By.linkText("Login");
//		ElementUtil eUtil = new ElementUtil(driver);
//		eUtil.doClick(loginLink);
		
		//7. partialLinkText: only for links : for the partial text of the link
		//driver.findElement(By.partialLinkText("Forgotten Password")).click();
		
		//8. tagName ; html tag: for headers or unique tags
		//String header = driver.findElement(By.tagName("h1")).getText();
		//System.out.println(header);
		
		By header = By.tagName("h1");
		ElementUtil eUtil = new ElementUtil(driver);
		String head = eUtil.doGetElementText(header);
		System.out.println(head);
		
		
		
		
		
		
		
		
		
		
	}

}
