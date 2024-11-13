package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement Sauname;
	
	@FindBy(id="password")
	WebElement saucepass;
	

	@FindBy(name = "login-button")
	WebElement sauceLogin;
	
		public Login(WebDriver driver) {
			// TODO Auto-generated constructors stub
			this.driver = driver;
			PageFactory.initElements(driver, this);//initializing webelements
		}
		public void setValues(String un,String pswd) {
			Sauname.sendKeys(un);
			saucepass.sendKeys(pswd);
		}
		
		
		public void loginClick() {
			
			sauceLogin.click();
	}

}
