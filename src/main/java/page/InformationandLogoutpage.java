package page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationandLogoutpage {
WebDriver driver;
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement laname;
	
	@FindBy(id="postal-code")
	WebElement pcode;
	
	@FindBy(id="continue")
	WebElement cntinu;
	
	@FindBy(id="finish")
	WebElement fin;
	
	@FindBy(id="back-to-products")
	WebElement bprdt;
	
	@FindBy(id="react-burger-menu-btn")//3 link click
	WebElement rbmt;
	
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	
	public InformationandLogoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String fn,String ln,String pc) {
	    fname.sendKeys(fn);
	    laname.sendKeys(ln);
	    pcode.sendKeys(pc);
	    
	}
	    public void countinueclick() {
	    cntinu.click();
	    
	
	    }
	    public void finishclick() {
	    	fin.click();
	    }
	    
	    public void backtohmeclick() {
	    	bprdt.click();
	    }
	    
	    public void dotclick() {
	    	rbmt.click();
	    }
	    
	    public void logout() {
	    	logout.click();
	    }
}


