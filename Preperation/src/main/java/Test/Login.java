package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends SetUp{

	public void login() {
		//WebElement userName = drv.findElement(By.id("username"));
		WebElement userName = drv.findElement(By.id("username"));
		WebElement password = drv.findElement(By.id("password"));
		WebElement submit = drv.findElement(By.className("decorativeSubmit"));
		userName.sendKeys("DemoSalesManager");
		password.sendKeys("crmsfa");
		submit.click();
	}
}
