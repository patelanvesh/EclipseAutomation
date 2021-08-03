package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public 	HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search= By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
		
	public WebElement getSearch()
	{
		return driver.findElement(search);
			
	}
	
	public WebElement getProductName()
	{
		return driver.findElement(productName);
	}

}
