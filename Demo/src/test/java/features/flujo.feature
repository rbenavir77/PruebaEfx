

Feature: Prueba demo equifax
Como: ejecutivo
Quiero: ingresar personas de nuestro equipo
Para: tener un control de nuestros trabajadores


@nuevo
Scenario: Ingreso de un cliente

Given Se ingresa al formulario principal
And Seleccionar boton add
When ingresar datos del cliente
|nombre		|apellido		|edad		|email						|salario | departamento|
|ricardo	|benavides	|40		  |ricardo@gmail.cl	|1000000 |TI|
Then verificar nuevo dato ingresado

