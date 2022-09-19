package MobileWorld;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class signup1 {
	@Test
	
	public static void signup() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashashree.shete\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage landingpage = new LandingPage(driver);
	        landingpage.goToSignin();
	        landingpage.goToSignup();
	        Thread.sleep(1000);
	        landingpage.goToData1("yashashree","shete","yashashree988@gmail.com","shree24","07/08/2000","8485076626","employee");
	        Thread.sleep(1000);
	        landingpage.goToRegister();
	        Thread.sleep(1000);
	        driver.switchTo().alert().accept();
	        driver.quit();
	              
	 }
	 
}
