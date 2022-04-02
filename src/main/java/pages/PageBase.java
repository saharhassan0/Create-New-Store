package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	protected WebDriver driver;
	
	//Create Constructor
	public PageBase(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
}
	
//	public void selectCountry(WebElement dropdown) 
//	
//	{
//		Select selectObject = new Select(dropdown);
//		selectObject.selectByIndex(63);
//	}
	
	public void ClickButton(WebElement element)
	{
		element.click();
	}
	

	
	
}

