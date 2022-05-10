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
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Soundariya851@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Janu5109@");
		driver.findElement(By.className("loginbutton")).click();
		driver.findElement(By.id("approvals_code")).sendKeys("056980");
	//	String text =driver.findElement(By.class(""))
			}
	}