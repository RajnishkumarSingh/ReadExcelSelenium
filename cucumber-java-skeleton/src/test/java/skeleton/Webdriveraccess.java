package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriveraccess {

	public WebDriver driver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TEMP.DIR.000\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  return driver;
	}
}
