package MobileWorld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class signin1 {
@Test(dataProvider = "getData")
	
		public static void signin(String username, String password12) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashashree.shete\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
        driver.get("https://qualicoach.org/mwapp/index.html");
    
        LandingPage landingpage = new LandingPage(driver);
    
   
        Thread.sleep(1000);
        landingpage.goToSignin(); 
        // landingpage.signin("yashashree988@gmail.com", "shree24");
        landingpage.signin(username,password12);
        Thread.sleep(1000);
        landingpage.goToLogin(); 
   
	}
@DataProvider
public Object[][] getData(){
     Object[][] data = new Object[3][2];
     
     data[0][0]="yashashree67";
     data[0][1]="shree826";
     
     data[1][0]="8757657623";
     data[1][1]="@#$$%%";
     
     data[2][0]="";
     data[2][1]="";
     return data;
}

}
