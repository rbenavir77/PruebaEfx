package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paso1Page extends BasePage{


	public Paso1Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Selectores
	String titulo= "/html/head/title";

	 @FindBy(id = "addNewRecordButton")
    private WebElement add;

    @FindBy(id = "submit")
    private WebElement btnSubmit;
    
    @FindBy(id = "firstName")
    private WebElement nombre;
    
    @FindBy(id = "lastName")
    private WebElement apellido;
    
    @FindBy(id = "userEmail")
    private WebElement mail;
    
    @FindBy(id  = "salary")
    private WebElement salario;
    
    @FindBy(id  = "age")
    private WebElement edad;
    
    @FindBy(id  = "department")
    private WebElement departamento;
    
    
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]")
    private WebElement nombreNuevoRegistro;

   
    
    

	public boolean isInitializedPaso1() {
		return this.elementExist(driver, By.xpath(titulo));
	}
    
	public void clicAdd() throws Exception {
		this.click(add);
	}
	
	public void clicSubmit() throws Exception {
		this.click(btnSubmit);
	}
    

    
    public void setNombre(String dato) throws Exception{
    	this.click(nombre);
    	this.sendKeys(nombre, dato);
    	this.setEnter(nombre);
		
	}
    
    public void setApellido(String dato) throws Exception{
    	this.click(apellido);
    	this.sendKeys(apellido, dato);
    	this.setEnter(apellido);
		
	}
    
    
    public void setEdad(String dato) throws Exception{
    	this.click(edad);
    	this.sendKeys(edad, dato);
    	this.setEnter(edad);
		
	}
    
    
    public void setEmail(String dato) throws Exception{
    	this.click(mail);
    	this.sendKeys(mail, dato);
    	this.setEnter(mail);
		
	}
    
    
    public void setSalario(String dato) throws Exception{
    	this.click(salario);
    	this.sendKeys(salario, dato);
    	this.setEnter(salario);
		
	}
    
    
    public void setDepartamento(String dato) throws Exception{
    	this.click(departamento);
    	this.sendKeys(departamento, dato);
		
	}
    
    
    public String getTextRegistro() throws Exception {
        return this.getText(nombreNuevoRegistro);
     }
    
    
    
    
    
    
    
    
    
    
    
    
    

	

}
