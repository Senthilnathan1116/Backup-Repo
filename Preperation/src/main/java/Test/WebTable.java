package Test;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;


public class WebTable {
	
	//public static void main(String args[]) throws IOException{
	@Test
	public void test() throws IOException{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("https://erail.in/");
		drv.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(drv,10);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtStationFrom")));
		drv.findElement(By.id("txtStationFrom")).clear();
		drv.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.TAB);
		
		drv.findElement(By.id("txtStationTo")).clear();
		drv.findElement(By.id("txtStationTo")).sendKeys("TPT",Keys.TAB);
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		drv.findElement(By.id("buttonFromTo")).click();
		drv.findElement(By.xpath("//a[@title='Click here to sort on Train Name']")).click();
		
		
		WebElement table = drv.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		
		/*File ss = drv.getScreenshotAs(OutputType.FILE);
	    File desc = new File("./Screenshot/img.png");
	    FileUtils.copyFile(ss, desc);*/
		
		
		for(WebElement row:tr) {
			List<WebElement> td = row.findElements(By.tagName("td"));
			System.out.println(td.get(1).getText());
		}
		
	}

}
