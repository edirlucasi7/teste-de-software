package param;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import param.CalculoImpostoRenda;

public class CalculaImpostoClassesValidasTest {

	@Test
	public void valoresImpostoValido1() {
		CalculoImpostoRenda calcula = new CalculoImpostoRenda();
		
		double imposto1 = calcula.calculaImposto(1240);
		double imposto2 = calcula.calculaImposto(5020);
		double imposto3 = calcula.calculaImposto(12005);
		double imposto4 = calcula.calculaImposto(100);
		double delta = 0.01;
		
		assertEquals(124, imposto1, delta);
		assertEquals(753, imposto2, delta);
		assertEquals(2401, imposto3, delta);
		assertEquals(0.0, imposto4, delta);
	
	}
	
}
