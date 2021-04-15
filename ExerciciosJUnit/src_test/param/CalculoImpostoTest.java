package param;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoImpostoTest {

	@Parameter(0)
	public double valor;
	@Parameter(1)
	public double impostoTotal;

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 200.5, 0.0 }, { 1201.0, 120.1 },
			{ 5002, 750.3 }, { 10001, 2000.2 } 
		});
	}

	@Test
	public void calculaImposto() {
		CalculoImpostoRenda calcula = new CalculoImpostoRenda();
		double delta = 0.01;
		System.out.println("A porcentagem do imposto é: " + calcula.retornaPorcentagemImposto(valor));
		assertEquals(impostoTotal, calcula.calculaImposto(valor), delta);
	}

}