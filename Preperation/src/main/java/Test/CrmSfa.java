package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CrmSfa extends Login{
	public void crmsfa() {
		WebElement crmsfa = drv.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
	}

}
