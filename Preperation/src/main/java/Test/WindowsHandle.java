package Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver drv = new ChromeDriver();
		drv.get("https://irctc.co.in/eticketing/loginhome.jsf");
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		List<String> w = new ArrayList<>();
		for(String s:w)
			System.out.println(s);
		drv.switchTo().window(w.get(0));
		drv.findElement(By.xpath("//button[@type='submit']")).click();
		w.add(drv.getWindowHandle());
		System.out.println(w.get(1));
	}
}
