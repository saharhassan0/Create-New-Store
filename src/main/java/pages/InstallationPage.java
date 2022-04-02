package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InstallationPage extends PageBase  {

	public InstallationPage(WebDriver driver)
	{
		super(driver);
	}


//	Select drpCountry = new Select(driver.findElement(By.id("country")));
//	drpCountry.selectByVisibleText("ANTARCTICA");
	
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/ul/li/div/div/div/div/div[1]/span[1]/span[1]/span/span[2]")
	WebElement firstSelection;
	
	@FindBy(xpath ="//span[text()='Yes, I sell products']")
	WebElement firstOption;
	
	
	@FindBy(name="setting[selling_channels][]")
	WebElement secondSelection;
	
	@FindBy(id = "products-select")
	WebElement thirdSelection;
	
	@FindBy(id = "range-select")
	WebElement fourthSelection;
	
	@FindBy(id= "industry-select")
	WebElement fifthSelection;
	
	@FindBy(xpath = "//input[@value='Yes']")
	WebElement firstRadio;
	
	@FindBy(xpath = "//input[@value='No']")
	WebElement seondRadio;


	public void InstallationSteps(int first, int second,int third,int fourth,int fifth ) 
{
		//new Select(firstSelection).selectByIndex(first);
		firstSelection.click();
		firstOption.click();
		new Select(secondSelection).selectByIndex(second);	
		new Select(thirdSelection).selectByIndex(third);	
		new Select(fourthSelection).selectByIndex(fourth);	
		new Select(fifthSelection).selectByIndex(fifth);	
		firstRadio.click();
		
		
}
}

