package pom;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se puede obtener el titutlo del sitio");
        }
    }
    


    public void click(WebElement objeto) throws Exception {
        try {
            objeto.click();
        } catch (Exception e) {
            throw new Exception("No se puede hacer click sobre el objeto: " + objeto);
        }
    }

    public void clear(WebElement objeto) throws Exception {
        try {
            objeto.clear();
        } catch (Exception e) {
            throw new Exception("No se encontró el elemento: " + objeto);
        }
    }

    public void sendKeys(WebElement objeto, CharSequence parametro) throws Exception {
      //  try {
            objeto.sendKeys(parametro);
     //   } catch (Exception e) {
      //      throw new Exception("No se puede ingresar caracteres sobre el elemento: " + objeto +e.getLocalizedMessage());
       // }
    }

    protected boolean isDisplayed(WebElement objeto) {
        try {
            return objeto.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getText(WebElement objeto) throws Exception {
        try {
           return  objeto.getText();
        } catch (Exception e) {
            throw new Exception("No se puede obtener el texto");
        }
    }
    
    public String getValue(WebElement objeto) throws Exception {
        try {
           return  objeto.getAttribute("value");
        } catch (Exception e) {
            throw new Exception("No se puede obtener el texto");
        }
    }
    
    protected boolean setEnter(WebElement objeto) {
        try {
             objeto.sendKeys(Keys.ENTER);
             return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    protected Boolean elementExist(WebDriver driver, By by) {
		Boolean retorno = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(40)), Duration.ofSeconds( Integer.valueOf(2)));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			retorno = driver.findElements(by).size() > 0;
		} catch (Exception e) {
			System.out.println("No se encuentra: "+by);
		}
		return retorno;
	}
    
    protected Boolean elementExistBiometria(WebDriver driver, By by) {
		Boolean retorno = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(420)), Duration.ofSeconds( Integer.valueOf(2)));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			retorno = driver.findElements(by).size() > 0;
		} catch (Exception e) {
			System.out.println("No se encuentra: "+by);
		}
		return retorno;
	}
    


    public static void waitSeconds(WebDriver D, Duration segundos) {
    	try {
    		WebDriverWait wait = new WebDriverWait(D, segundos);
    		wait.until(ExpectedConditions.invisibilityOf(D.findElement(By.xpath("/html/body"))));
    	} catch (Exception error) {
    	}
    }
    

	protected WebElement getFluidWait(WebDriver driver, final By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofSeconds(20)).ignoring(Exception.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
		});
		return element;
	}
	
	protected Boolean elementoClickable(WebDriver driver, By by) {
		Boolean retorno = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofMillis(2000));
			WebElement obWElement  = wait.until(ExpectedConditions.elementToBeClickable(by));
		
			retorno = (obWElement != null);
		} catch (Exception e) {
			System.out.println(by.toString() + "Timeout exceeded");
		}
		return retorno;
	}
	

}
