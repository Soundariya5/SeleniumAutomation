package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("d");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abc");
  	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
//	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6473");
//	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123253");
//	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
//	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("123324");
//	    driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("Abc");
//	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("4214316");
	    WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select createLeadForm_dataSourceId=new Select(source);
		createLeadForm_dataSourceId.selectByVisibleText("Other");
//		WebElement campaign=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
//		Select createLeadForm_marketingCampaignId=new Select(campaign);
//		createLeadForm_marketingCampaignId.selectByVisibleText("Car and Driver");
//		WebElement Industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
//		Select createLeadForm_industryEnumId=new Select(Industry);
//		createLeadForm_industryEnumId.selectByVisibleText("Media");
//		WebElement Ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
//		Select createLeadForm_ownershipEnumId=new Select(Ownership);
//		createLeadForm_ownershipEnumId.selectByVisibleText("Corporation");
//		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
//		Select createLeadForm_generalStateProvinceGeoId=new Select(State);
//		createLeadForm_generalStateProvinceGeoId.selectByVisibleText("India");
		//driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/10/99");
		/*WebElement date=driver.findElement(By.id("createLeadForm_birthDate"));
		Select createLeadForm_birthDate=new Select(date);
		createLeadForm_birthDate.selectByVisibleText("05/10/99");*/
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String firstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);
		
		
	    
	    
		// TODO Auto-generated method stub

	}

}
