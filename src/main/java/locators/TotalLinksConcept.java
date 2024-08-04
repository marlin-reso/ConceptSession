package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) {
		
		//1. total links
		//2. print the text of each link
		//3. avoid blank text
		//4. broken links -later
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//find all the links 
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links : "+ allLinks.size());
		
//		for(int i=0; i<allLinks.size();i++) {
//			String links = allLinks.get(i).getText();
//			if(links.length()!=0) {
//			System.out.println(links);
//			}	
//		}
		
		for(WebElement i:allLinks) {			
			String link = i.getText();
			if(link.length()!=0) {
				System.out.println(link);
			}
		}
		
		List<WebElement> textField = driver.findElements(By.className("form-control"));
		System.out.println(textField.size());
		
//		for(WebElement e: textField) {
//			e.sendKeys("testing");
//			
//		}
		
		
		
		
		
		
		
		
		
		

	}

}
