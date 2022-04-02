package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateStoreFormObjects extends PageBase {

	//extends: inherit
	public CreateStoreFormObjects(WebDriver driver)
	{
		super(driver);	
	}
	
	@FindBy(id ="storename")
	WebElement StoreName;
	
	@FindBy(id = "clientname")
	WebElement Name;

	@FindBy(id = "clientemail")
	WebElement Email;
	
	@FindBy(id = "clientpassword")
	WebElement Password;
	
	@FindBy(id = "cphone")
	WebElement Mobile;
	
	@FindBy(id = "btnSubmit")
	WebElement SubmitBtn;

//	
//	@FindBy(className = "selected-flag")
//	WebElement dropdown;	
//	
	

	public void CreateStoreMethod(String storeName, String name, String email, String password ,String mobile) 
	{
		StoreName.sendKeys(storeName);
		Name.sendKeys(name);
		Email.sendKeys(email);
		Password.sendKeys(password);
//		selectCountry(dropdown);
		Mobile.sendKeys(mobile);		
		//SubmitBtn.click();
		ClickButton(SubmitBtn);

	}
	
	
}