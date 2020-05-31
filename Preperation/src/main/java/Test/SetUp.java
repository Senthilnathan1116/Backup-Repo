package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebElement;


public class SetUp {

	public WebDriver drv=null;
	SetUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("http://leaftaps.com/opentaps");
		drv.manage().window().maximize();
	}
}
