package param;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import param.CalculoImpostoRenda;

public class CalculaImpostoClassesInvalidasTest {

	private CalculoImpostoRenda imposto;
	double delta = 0.01;
	
	@Before
	public void setUp() {
		imposto = new CalculoImpostoRenda();
	}
	
	/**
	 * Este método testa o metodo calculaImposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se valor < 1201 deve pagar 0% de imposto
	 * 
	 */
	@Test(expected=ImpostoIlegalException.class) 
	public void valorImpostoInvalido1() {
		double resultado = imposto.calculaImposto(1300);
		
		assertEquals(0.0, resultado, delta);
	} 
	
	/**
	 * Este método testa o metodo calculaImposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se  1201 <= valor <= 5000 deve pagar 10% de imposto
	 * 
	 */
	@Test(expected=ImpostoIlegalException.class)
	public void valorImpostoInvalido2() {
		double resultado = imposto.calculaImposto(100);
		
		assertEquals(124, resultado, delta);
	}
	
	/**
	 * Este método testa o metodo calculaImposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se  5001 <= valor <= 10000 deve pagar 15% de imposto
	 * 
	 */
	@Test(expected=ImpostoIlegalException.class)
	public void valorImpostoInvalido3() {		
		double resultado = imposto.calculaImposto(4000);
		
		assertEquals(753, resultado, delta);
	}
	
	/**
	 * Este testa o metodo calculaImposto a ser pago baseado no valor de uma dada compra.
	 * 
	 * Se  valor > 10000 deve pagar 20% de imposto
	 * 
	 */
	@Test(expected=ImpostoIlegalException.class)
	public void valorImpostoInvalido4() {
		double resultado = imposto.calculaImposto(9000);
		
		assertEquals(2401, resultado, delta);
	}
	
}
