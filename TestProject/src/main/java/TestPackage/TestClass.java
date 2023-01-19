package TestPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPackage.SearchDetailsPage;
import org.testng.Assert;





public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Workspace\\SelPractise\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://translate.google.co.in");
        driver.manage().window().maximize();
		SearchDetailsPage page=new SearchDetailsPage(driver);
		page.expandSelection().click();
	    page.selectLanguage().sendKeys("English");
	    page.selectLanguage().sendKeys(Keys.ENTER);
	    page.enterTextToBeTransslated().sendKeys("Test");
	    driver.wait(1000);
	   // Commented this code as we open google translator in the translated language by default displaying google
	   // page.getLanguage().click();
	   // page.getTranslatedLang().sendKeys("English");
	   // page.getTranslatedLang().sendKeys(Keys.ENTER);
	    
	    String expectedValue = "Test";
	    String actualTeanslatedValue = page.getTranslatedValue();
	    Assert.assertEquals(actualTeanslatedValue, expectedValue);        
	   
	}

}
