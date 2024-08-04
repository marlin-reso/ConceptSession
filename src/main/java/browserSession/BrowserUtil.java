package browserSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import exception.BrowserException;
import exception.UrlException;
/**
 * @author sanjay
 */

public class BrowserUtil {
	
	

	WebDriver driver;
	/**
	 * This method used to initialize the driver on the basis of given browser name
	 * @param browserName
	 * @return
	 */

	public WebDriver launchBrowser(String browserName) {

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();

			break;
		case "firefox":

			driver = new FirefoxDriver();

			break;
		case "edge":
			driver = new EdgeDriver();

			break;

		default:
			throw new BrowserException(ErrorLogs.BROWSER_EROOR);

		}
		return driver;

	}

	public void lauchURL(String url) {

		if (url == null) {
			throw new UrlException(ErrorLogs.URL_EROOR);
		}
		if (url.indexOf("http") == 0) {
			driver.get(url); 
		}

		else {
			throw new BrowserException(ErrorLogs.HTTP_ERROR);

		}

	}
	
	/*
	 * convert any kind of data into String [ String appUrl = String.valueOf(url);]
	 */
	public void launchURL(URL url) {
		
		if(url ==null) {
			throw new UrlException(ErrorLogs.URL_EROOR);
		}
	    String appUrl =  String.valueOf(url);
		if(appUrl.indexOf("http")==0) {
			driver.navigate().to(appUrl);
		}
		
	}
	

	public String getTitle() {
		return driver.getTitle();
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}
