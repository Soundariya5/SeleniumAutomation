package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWebdriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.id("approvals_code")).sendKeys("056980");
	    String text =driver.findElement(By.tagName("h2")).getText();	
	    System.out.println(text);
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("Abc");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("Abc");
	    
	}
	}