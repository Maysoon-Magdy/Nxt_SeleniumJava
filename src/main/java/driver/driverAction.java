package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverAction {
	public static WebDriver driver;

	public static void initBrowser(BrowserType browser) {
		switch(browser){
		case chrome:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			break;
		case fireFox: 
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.addArguments("--private");
			driver = new FirefoxDriver(fOptions);
			break;
		}
	}

	public static String getCurrentUrl(){
		return driver.getCurrentUrl();
	}
}
