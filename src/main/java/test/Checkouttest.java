package test;

import org.testng.annotations.Test;

import base.Base_class;
import page.Checkoutpage;
import page.Login;
import page.Productpage;
import util.Excelutil;

public class Checkouttest extends Base_class {
	@Test
	public void addtocart() throws InterruptedException {
	Login log=new Login(driver);
	String x1="D:\\automation\\seleniunm\\Saucedemowork.xlsx";
	String sheet="Sheet1";
	int rowCount = Excelutil.getRowCount(x1, sheet);
	System.out.println(rowCount);
	
	for (int i= 1; i <= rowCount;i++)
	{
		int cellCount = Excelutil.getCellcount(x1, sheet, i);
		System.out.println("Cell Count: "+cellCount);
		
		
		for (int j = 0; j< cellCount; j += 2) { 
			String userName = Excelutil.getCellValue(x1, sheet, i, j);
			System.out.println("UserName = " + userName);
		    String pwd = Excelutil.getCellValue(x1, sheet, i, j + 1);
			System.out.println("Password = " + pwd);
			
		
			log.setValues(userName, pwd);
		    log.loginClick();
		    
			
			
			String act_url=driver.getCurrentUrl();
			String exp_url="https://www.saucedemo.com/inventory.html";
			
			if(act_url.equalsIgnoreCase(exp_url)){
			  System.out.println("login success");
			  break;
			}
			
			else {
				System.out.println("login failed");
			}
				Thread.sleep(1000);
				driver.get("https://www.saucedemo.com/");
			}
	}
	Productpage  pdt=new Productpage (driver);
	pdt.loginclick();
 Checkoutpage pdt1=new Checkoutpage(driver);
		pdt1.cartclick();
		pdt1.checkout();
		
	}
}