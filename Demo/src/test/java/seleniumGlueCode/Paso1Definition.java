package seleniumGlueCode;



import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.testng.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Paso1Page;

public class Paso1Definition extends TestBase{
	

	@Given("Se ingresa al formulario principal")
	public void formularioPrincipal() throws Exception {
		Assert.assertTrue(paso1.isInitializedPaso1());
		System.out.println("ingresa a la web");
	}

	@Given("Seleccionar boton add")
	public void seleccionarBotonAdd() throws Exception {
		paso1.clicAdd();
		System.out.println("Se realiza clic en el boton add");
	}



	@When("ingresar datos del cliente")
	public void ingresarDatos(DataTable dataTable) throws Exception {
		try {
			List<Map<String, String>> dataMap=dataTable.asMaps();
			System.out.println(dataMap);
			
			//Datos Cliente
			paso1.setNombre(dataMap.get(0).get("nombre"));
			
			paso1.setApellido(dataMap.get(0).get("apellido"));
			
			paso1.setEdad(dataMap.get(0).get("edad"));
			
			paso1.setEmail(dataMap.get(0).get("email"));
			
			paso1.setSalario(dataMap.get(0).get("salario"));
			
			paso1.setDepartamento(dataMap.get(0).get("departamento"));
			
			Paso1Page.waitSeconds(driver, Duration.ofSeconds(3));
						
			paso1.clicSubmit();
			Paso1Page.waitSeconds(driver, Duration.ofSeconds(3));
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}

		
	}

	@Then("verificar nuevo dato ingresado")
	public void muestraModalDeMach() throws Exception {
		System.out.println("El nombre del registro ingresado es: "+paso1.getTextRegistro());

	}


}
