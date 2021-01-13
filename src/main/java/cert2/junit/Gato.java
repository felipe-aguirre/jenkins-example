import org.junit.Test;

import org.junit.Assert;

public class Main {
	public static void main(String[] args) {
		
		String color;
		String nombrePropietario;
		int gatitos;
		
		//Constructor
		Gato(String color, String nombrePropietario, int gatitos) {
			super();
			this.color = color;
			this.nombrePropietario = nombrePropietario;
			//Si el gato intenta ser instanciado con más de 2 gatitos, se acota a 2.
			//El resto de gatitos queda sin adoptar
			this.gatitos = Math.min(gatitos, 2);
		}
		//Getters y Setters
		String getColor() {
			return color;
		}

		//Getter renombrado para cumplir condiciones del enunciado
		String propietario() {
			return nombrePropietario;
		}



		int getGatitos() {
			return gatitos;
		}

		void addGatito(int gatitos) {
			if (gatitos > 0) {
				this.gatitos = Math.min(gatitos + this.gatitos, 2);
			}
		}
		
		@Override
		boolean equals(Object otro) {
			if (this == otro) return true;
			if (otro == null || getClass() != otro.getClass()) return false;
			
			Gato otroGato = (Gato) otro;
			return this.color.equals(otroGato.color);
		}

		
	}
}

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