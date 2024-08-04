package browserSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
//		ChromeOptions co =  new ChromeOptions();
//	//	co.addArguments("--headless");
//		co.addArguments("--incognito");
//		
//		WebDriver driver = new ChromeDriver(co);
//		driver.get("https://www.google.com");
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.quit();
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--inprivate");
	//	eo.addArguments("--headless");
		
		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.quit();
		
		

	}

}
