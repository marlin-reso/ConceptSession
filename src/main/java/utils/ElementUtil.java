package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase().trim()) {
		case "id":
			locator = By.id(locatorValue);
			break;
			
		case "name":
			locator = By.name(locatorValue);
			break;
			
		case "className":
			locator = By.className(locatorValue);
			break;
			
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
			
		case "css":
			locator = By.cssSelector(locatorValue);
			break;		
	
			
		case "linkText":
			locator = By.linkText(locatorValue);
			break;	
			
		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;		

		case "tagName":
			locator = By.tagName(locatorValue);
			break;		
	

		default:
			break;
		}

		return locator;

	}
	
	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));

	}

	public WebElement getElement(By locators) {

		return driver.findElement(locators);
	}
	
	
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(locatorType, locatorValue).sendKeys(value);
		
		
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {

		getElement(locator).click();
	}
	
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public String getAttributeValue(By locator,String attName) {
		return getElement(locator).getAttribute(attName);
		
	}

}
