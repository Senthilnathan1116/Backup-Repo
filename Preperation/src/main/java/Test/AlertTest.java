package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
 public static void main(String args[]) {
	 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	 ChromeDriver drv = new ChromeDriver();
	 drv.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	 drv.manage().window().maximize();
	 drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 drv.switchTo().frame(drv.findElement(By.id("iframeResult")));
	 drv.findElement(By.xpath("//button[text()='Try it']")).click();
	 Alert a = drv.switchTo().alert();
	 a.sendKeys("Senthil");
	 System.out.println(a.getText());
	 a.accept();
	  
	 
 }
}
