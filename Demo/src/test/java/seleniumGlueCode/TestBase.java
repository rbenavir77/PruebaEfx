package seleniumGlueCode;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import pom.Paso1Page;





public class TestBase {
    protected ChromeDriver driver = Hooks.getDriver();
    protected Paso1Page paso1 = PageFactory.initElements(driver,pom.Paso1Page.class);
      
   
  
	
    
				
	}





