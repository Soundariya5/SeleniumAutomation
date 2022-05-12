package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnDropDown {
//private static WebElement findElement;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//Select dd1=new Select(driver.findElement(By.id("dropdown1")));
		//driver.findElement(By.id("dropdown1")).sendKeys("Appium");
		WebElement dd1=driver.findElement(By.id("dropdown1"));
		Select dropdown1=new Select(dd1);
		dropdown1.selectByVisibleText("Appium");
	}

}
