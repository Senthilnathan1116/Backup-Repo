package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindLead extends Create_Lead{

	public void findlead() {
		WebElement findLeads = drv.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		findLeads.click();
		WebElement leadID = drv.findElement(By.xpath("//input[@name='id']"));
		leadID.sendKeys("10762");
		WebElement submit = drv.findElement(By.xpath("(//button[@type='button'])[7]"));
		submit.click();
		drv.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement lead = drv.findElement(By.xpath("(//a[contains(text(),'10762')])[1]"));
		lead.click();
		WebElement edit = drv.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		edit.click();
	}

	public void editLead() {
		WebElement industry = drv.findElement(By.xpath("//select[@id='updateLeadForm_industryEnumId']"));
		Select industryDD = new Select(industry);
		industryDD.selectByVisibleText("Media");
		WebElement ownerShip = drv.findElement(By.xpath("//select[@id='updateLeadForm_ownershipEnumId']"));
		Select ownership = new Select(ownerShip);
		ownership.selectByVisibleText("Corporation");
		List<WebElement> ownershipOptions = new ArrayList<>();
		ownershipOptions.addAll(ownership.getOptions());
		for(WebElement e:ownershipOptions) 
			System.out.println(e.getText());
		WebElement update = drv.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
		update.click();


	}

}
