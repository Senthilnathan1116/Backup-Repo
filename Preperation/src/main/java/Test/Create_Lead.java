package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Create_Lead extends CrmSfa{

	public void createLead() {
		WebElement leads = drv.findElement(By.linkText("Leads"));
		leads.click();
		WebElement createLeads = drv.findElement(By.linkText("Create Lead"));
		createLeads.click();
		WebElement cName = drv.findElement(By.id("createLeadForm_companyName"));
		WebElement pAcct = drv.findElement(By.xpath("//input[@name='parentPartyId']"));
		WebElement fName = drv.findElement(By.id("createLeadForm_firstName"));
		WebElement lName = drv.findElement(By.id("createLeadForm_lastName"));
		WebElement source = drv.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		WebElement mCampaign = drv.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		WebElement fnameLocal = drv.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
		WebElement lnameLocal = drv.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']"));
		WebElement salutation = drv.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']"));
		WebElement title = drv.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']"));
		WebElement dept = drv.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"));
		WebElement arevnu = drv.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']"));
		WebElement pCurrency = drv.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']"));
		WebElement industry = drv.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		
		cName.sendKeys("Test Company");
		fName.sendKeys("Test First Name");
		lName.sendKeys("Test Last Name");
		WebElement createLead = drv.findElement(By.name("submitButton"));
		createLead.click();
	}
}
