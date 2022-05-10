package assignments;
       // import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
		import io.github.bonigarcia.wdm.WebDriverManager;
		//import org.openqa.selenium.firefox.FirefoxDriver;
		//import org.openqa.selenium.edge.EdgeDriver;

		public class Browser {

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				/*WebDriverManager.edgedriver().setup();
				EdgeDriver driver=new EdgeDriver();
				driver.get("https://www.facebook.com/login/");
				
				WebDriverManager.firefoxdriver().setup();
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/login/");*/
				driver.manage().window().maximize();
	}

}
