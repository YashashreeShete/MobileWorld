package MobileWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	//sign-up
	
@FindBy(xpath="//button[normalize-space()='SIGN IN']")
WebElement signin;
@FindBy(xpath="//a[normalize-space()='Sign up']")
WebElement signup;
@FindBy(xpath="//input[@placeholder='First Name']")
WebElement firstname;
@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement lastname;
@FindBy(xpath="//input[@placeholder='Enter Email']")
WebElement email;
@FindBy(xpath="//input[@placeholder='Password']")
WebElement password1;
@FindBy(xpath="//input[@type='date']")
WebElement date;
@FindBy(xpath="//div[@class='col-md-3']//input[@name='gender']")
WebElement gender;
@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
WebElement mobile_num;
@FindBy(xpath="//textarea[@placeholder='Short Bio']")
WebElement bio;
@FindBy(css="button[type='submit']")
WebElement register;
public void goToSignin() {
	
	    signin.click();
	}
	public void goToSignup() {
	    signup.click();
	}
	public void goToData1(String Firstname,String Lastname,String Email,String Password,String Date,String Mobile,String Bio ) {
	    firstname.sendKeys(Firstname);
	    lastname.sendKeys(Lastname);
	    email.sendKeys(Email);
	    password1.sendKeys(Password);
	    date.sendKeys(Date);
	    gender.click();
	    mobile_num.sendKeys(Mobile);
	    bio.sendKeys(Bio);
	    
	}
	public void goToRegister() {
	    register.click();
}

//sign in

@FindBy(id="username")
WebElement username;
@FindBy(id="password")
WebElement password12;
@FindBy(css="a[type='submit']")
WebElement login;
public void signin(String Username, String Password) {
    username.sendKeys(Username);
    password12.sendKeys(Password);
}
public void goToLogin() {
    login.click();
}

}
