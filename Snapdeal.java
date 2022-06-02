package week5.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement brands=driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']//following-sibling::span[2]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		driver.findElement(By.xpath("//a[@class='rightMenuLink  noHasTagWidth dp-widget-link']//following-sibling::span[1]")).click();
        String counts=driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println(counts);
        String title="Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands";
        String title2=driver.getTitle();
        if(title.equals(title2)) {
        	System.out.println("same");
        }
        else {
        	System.out.println("different");
        }
	}

}
