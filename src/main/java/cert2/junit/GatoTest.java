package cert2.junit;


import org.junit.jupiter.api.Test;

import org.junit.Assert;


class GatoTest {


	//Test 1
	@Test
	public void testGatoNull() {
		//Given
		Gato gato = new Gato("Negro","Felipe", 0);
		
		//When
		
		//Then
		Assert.assertNotNull("No está definido el gato", gato);
	}
	
	//Test 2
	@Test
	public void testDuenoNull() {
		//Given
		Gato gato = new Gato("terremoto","Juanito", 3);
		
		//When
		
		//Then
		Assert.assertNotNull("No está definido el dueño del gato",gato.propietario());
		
	}
	//Test 3
	@Test
	public void testGatoColor() {
		//Given
		Gato gato = new Gato("blanco","Felipe", 0);
		
		//When
		String color = gato.getColor();
		
		//Then
		Assert.assertEquals("El color del gato no es blanco","blanco",color);
	}
	//Test 4
	@Test
	public void testCantidadGatitos() {
		//Given
		Gato gato = new Gato("blanco","Felipe", 4);
		
		//When
		int gatitos = gato.getGatitos();
		//Then
		Assert.assertEquals("El gato no tiene 4 gatitos", 4,gatitos );
	}
	//Test 5
	@Test
	public void testGatosIguales() {
		//Given
		Gato gatoNegro1 = new Gato("Negro","Felipe", 0);
		Gato gatoNegro2 = new Gato("Negro","Oscar", 1);
		
		//When
		
		//Then
		Assert.assertEquals("Según su color, los gatos no son iguales",gatoNegro1, gatoNegro2);
	}
	
	//Test 6
	@Test
	public void intentarAgregarGatos() {
		//Given
		Gato gato = new Gato("Negro","Felipe", 0);
		
		//When
		gato.addGatito(6);
		
		//Then
		Assert.assertEquals("La cantidad de gatitos no coincide",6, gato.getGatitos());
	}
	
}
