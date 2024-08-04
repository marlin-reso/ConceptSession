package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	

	public static void main(String[] args) {

		// attributes = id, name, className, linkText etc
		// text --> getText()
		// attribute --> getAttribute()
		// get all the links
		// capture href value

		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String fnPlaceHolder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String lnPlaceHolder = driver.findElement(By.id("input-lastname")).getAttribute("placeholder");
//		String mailPlaceHolder = driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		
//		System.out.println(fnPlaceHolder+" : "+lnPlaceHolder+" : "+mailPlaceHolder);

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By email = By.id("input-email");
		By forgotPwd = By.linkText("Forgotten Password");
		
		String attFName = getAttributeValue(fName, "name");
		String attLName = getAttributeValue(lName, "placeholder");
		String attEmail = getAttributeValue(email, "class");
		
		String fogotPwdhref = getAttributeValue(forgotPwd, "href");
		System.out.println(attFName+ " : "+ attLName+" : "+ attEmail+" : "+fogotPwdhref);
		
	}
	
	
	public static WebElement getLocator(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static String getAttributeValue(By locator,String attName) {
		return getLocator(locator).getAttribute(attName);
		
	}

}
