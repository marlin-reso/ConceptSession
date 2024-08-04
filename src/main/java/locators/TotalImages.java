package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	//Go to every image and capture the src Attribute

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
//		List<WebElement> totalImages =driver.findElements(By.tagName("img"));
//		System.out.println(totalImages.size());
		
		List<WebElement> totalImages =captureTagName("img");
		
		for(WebElement e:totalImages) {
		String srcValue = e.getAttribute("src");	
		System.out.println(srcValue);
			
			
		}
		
		
		
	}
	
	//This process is known as web scrapping- with the help of this flipKart and amazon fetch the price of each other
	//and based on that they decide their priceing.
	public static List<WebElement> captureTagName(String tagName) {
		List<WebElement> ImgList = driver.findElements(By.tagName(tagName));
		return ImgList;
		
	}
	
	

}
