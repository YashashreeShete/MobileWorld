package MobileWorld;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class signup1 {
@Test(dataProvider = "getData")
	
	public static void signup(String firstname,String lastname,String email,String password1,String date,String mobile_num,String bio) throws InterruptedException {
		
		
			
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashashree.shete\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	       
	        driver.manage().window().maximize();
	        
	        
	        driver.get("https://qualicoach.org/mwapp/index.html");
	        LandingPage landingpage = new LandingPage(driver);
	        landingpage.goToSignin();
	        landingpage.goToSignup();
	        Thread.sleep(1000);
	        // landingpage.goToData1("yashashree","shete","yashashree988@gmail.com","shree24","07/08/2000","8485076626","employee");
	        landingpage.goToData1(firstname,lastname,email,password1,date,mobile_num,bio);
	        Thread.sleep(1000);
	        landingpage.goToRegister();
	        Thread.sleep(1000);
	        driver.switchTo().alert().accept();
	        driver.quit();
	              
	 }
	@DataProvider
	public Object[][] getData(){
	     Object[][] data = new Object[2][7];
	     
	     data[0][0]="yashashree";
	     data[0][1]="shete";
	     data[0][2]="yashashree988@gmail.com";
	     data[0][3]="69898";
	     data[0][4]="2/2/1999";
	     data[0][5]="9916854675";
	     data[0][6]="im a student";
	     
	     data[1][0]="5783";
	     data[1][1]="787624";
	     data[1][2]="yashashree@gmail.com";
	     data[1][3]="asnkjwns";
	     data[1][4]="9/9/2000";
	     data[1][5]="854675";
	     data[1][6]="ghgf";
	     return data;
	} 
}
