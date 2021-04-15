package param;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoImpostoValorLimiteTest {

	@Parameter(0)
	public double xmenosum;
	@Parameter(1)
	public double x;
	@Parameter(2)
	public double xmaisum;
	@Parameter(3)
	public double impostoTotalXmenosum;
	@Parameter(4)
	public double impostoTotalX;
	@Parameter(5)
	public double impostoTotalXmaisum;
	
	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 1200, 1201, 1202, 120.0, 120.1, 120.2 },
			{ 4099, 5000, 5001, 409.9, 500.0, 500.1 },
			{ 5000, 5001, 5002, 750.0, 750.15, 750.3 },
			{ 9999, 10000, 10001, 1499.85, 1500.0, 1500.15 }
		});
	}
	
	@Test
	public void calculaImposto1() {
		CalculoImpostoRenda calcula = new CalculoImpostoRenda();
		double delta = 0.01;
			
		assertEquals(impostoTotalXmenosum, calcula.calculaImposto(xmenosum), delta);
		assertEquals(impostoTotalX, calcula.calculaImposto(x), delta);
		assertEquals(impostoTotalXmaisum, calcula.calculaImposto(xmaisum), delta);
	}
	
}
