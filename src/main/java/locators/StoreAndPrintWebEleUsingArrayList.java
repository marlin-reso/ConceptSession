package locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreAndPrintWebEleUsingArrayList {

	static WebDriver driver;

	public static void main(String[] args) {
		/**
		 * 1. Capture the webElements help of Tagname. 2. convert it into locator 3.
		 * give the count of locators 4. itterate it and store it into ArrayList. 5.
		 * print the array list which contain the total text which is comming from tag
		 * name.
		 */

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		By links = By.tagName("a");
		By images = By.tagName("img");

		System.out.println(getElementsCount(links));
		System.out.println(getElementsCount(images));

		ArrayList<String> eleText = getElementTextList(links);
		System.out.println(eleText);

		System.out.println("-----------------------");
		
		List<WebElement> totalImg = capTagname("img");
		for(WebElement e: totalImg) {
			String srcValue =e.getAttribute("src");
		}
		
		

	}

	public static List<WebElement> capTagname(String tagName) {
		List<WebElement> imgList = driver.findElements(By.tagName(tagName));
		return imgList;
	}
	

	public static ArrayList<String> capAttribute(String tagName, String AttrName) {
		ArrayList<String> srcList = new ArrayList<String>();
		List<WebElement> list = capTagname(tagName);
		for (WebElement e : list) {

			String src = e.getAttribute("img");
			if (src.length() != 0) {
				srcList.add(src);
			}
		}
		return srcList;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {

		return getElements(locator).size();
	}

	public static ArrayList<String> getElementTextList(By locator) {

		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {

			String text = e.getText();
			if (text.length() != 0) {

				eleTextList.add(text);

			}

		}
		return eleTextList;
	}

}
