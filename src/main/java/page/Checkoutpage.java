package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	WebDriver driver;
	


@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	WebElement clickcart;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
   public Checkoutpage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
public void cartclick(){
	clickcart.click();
	
	
}
   public void checkout() {
	   checkout.click();
	   }
	   }
   

