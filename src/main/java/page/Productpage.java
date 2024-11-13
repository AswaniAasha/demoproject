package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {




	
WebDriver driver;
	
	@FindBy(xpath="//button[text()=\"Add to cart\"]")//xpath
	List<WebElement> addtocart;//stored on list
	
	
	 
	public Productpage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
     public void loginclick() throws InterruptedException {
    	 
		for(WebElement cart:addtocart) {
			cart.click();
		}
     }
}
