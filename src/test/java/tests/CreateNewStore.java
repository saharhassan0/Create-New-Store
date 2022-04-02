package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CreateStoreFormObjects;
import pages.InstallationPage;

public class CreateNewStore extends TestBase {
	
	CreateStoreFormObjects	object;
	InstallationPage InstallationPageObject;
	
	@DataProvider(name = "testData")
	public static Object[][] CreateStoreData() {
	    return new Object[][]
	            {
	                    {"sahar's store", "sahar" , "sahar.59@yahoo.com" , "saharhassanSS55@@@@" ,   "01005582222"}};
	            }	            

	    @DataProvider(name = "testInstall")	    
	    public static Object[][] InstallationData(){
        	return new Object[][]
        	{
        		{0, 2 , 1, 1 ,2},
        	};
        	}
	            
//priority run first
	@Test(dataProvider = "testData" , priority = 1)
	public void CreateStores(String storename, String name , String email, String password, String mobile) throws InterruptedException {
	    object = new CreateStoreFormObjects(driver);
	    object.CreateStoreMethod(storename, name, email, password, mobile);  
	  
	    Thread.sleep(80000);
	}}
	
	
//	@Test(dataProvider = "testInstall", priority = 2)
//		public void CreateInstallation(int First, int Second,int Third,int Fourth,int Fifth) {
//			InstallationPageObject = new InstallationPage(driver);
//			InstallationPageObject.InstallationSteps(First, Second, Third, Fourth, Fifth);
//		}}
//	


