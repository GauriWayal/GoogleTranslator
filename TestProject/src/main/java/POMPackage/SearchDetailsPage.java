package POMPackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDetailsPage {
	
	WebDriver driver;
	 public SearchDetailsPage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver , this);
	 }
	
	 
	 @FindBy(className="VfPpkd-Bz112c-RLmnJb")
	 WebElement expand;
	 
	 
	 @FindBy(className="yFQBKb")
	 WebElement selectlang;
	 
	 @FindBy(className="yFQBKb")
	 WebElement entertext;
	 
	 @FindBy(css="div:nth-child(5) > button > div.VfPpkd-Bz112c-RLmnJb")
	 WebElement seltranslated;
	 
	 @FindBy(css="div:nth-child(2) > c-wiz > div.ykTHSe > div > div.fMHXgc.qkH7ie > input")
	 WebElement text;
 
	 @FindBy(className="er8xn")
	 WebElement enterText;
	 
	 @FindBy(xpath="//span[@jscontroller='Gn4SMb']//span")
	 WebElement teanslatedValue;
	 
	  
   public  WebElement expandSelection()
   {
   	System.out.println("Click on expand icn to select language");
   	return expand;
   }
   
   public  WebElement selectLanguage()
   {
   	System.out.println("Click on expand icn to select language");
   	return selectlang;
   }
   
   public  WebElement getText()
   {
   	System.out.println("Enter Text of Translation");
   	return entertext;
   }
   
   public  WebElement getLanguage()
   {
   	System.out.println("Select Language of text to be transalated");
   	return seltranslated;
   }
   
   public  WebElement getTranslatedLang()
   {
   	System.out.println("Select Language of text to be transalated");
   	return text;
   }
   
   public  WebElement enterTextToBeTransslated()
   {
   	System.out.println("Enter Text to be Transalted");
   	return enterText;
   }
   
   public String getTranslatedValue() throws InterruptedException {
	   Thread.sleep(5000);
	   return teanslatedValue.getText();
   }

}
