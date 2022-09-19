package MobileWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Allmobiles1 {
	@Test

	public static void AllMobiles() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashashree.shete\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    LandingPage landingpage=new LandingPage(driver);
	   driver.get("https://mobileworld.banyanpro.com/");
	 
	    
	    Thread.sleep(1000);
	    
	    landingpage.allmobileapplication("Samsung Galaxy S21");
	    
	}

}
