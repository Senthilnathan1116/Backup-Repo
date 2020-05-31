package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MergeLead extends FindLead{

	public void callMergeLead() {
		WebElement mergeLead = drv.findElement(By.xpath("//a[text()='Merge Leads']"));
		mergeLead.click();
		/*WebElement fromLead = drv.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']"));
		WebElement toLead = drv.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']"));*/

		WebElement fromLead = drv.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::input)[2]"));
		WebElement toLead = drv.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']"));
		
		
		WebElement merge = drv.findElement(By.xpath("//a[text()='Merge']"));
		fromLead.sendKeys("10041");
		toLead.sendKeys("10042");
		merge.click();
	}
}
