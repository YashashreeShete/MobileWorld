package MobileWorld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class signin1 {
@Test
	
		public static void signin() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashashree.shete\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    
    driver.get("https://mobileworld.banyanpro.com/");
    
   LandingPage landingpage = new LandingPage(driver);
    
   
   Thread.sleep(1000);
   landingpage.goToSignin(); 
   landingpage.signin("yashashree988@gmail.com", "shree24");
   Thread.sleep(1000);
    landingpage.goToLogin(); 
   
	}
}
