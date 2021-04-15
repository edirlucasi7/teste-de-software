package param.temperature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConversorTemperaturaCelsiusTest {
	 
	@Parameter(0)
	public double fahrenheit;
	@Parameter(1)
	public double celsius;

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 212.0, 100.0 }, { 500.0, 260.0 } 
		});
	}
	
	@Test
	public void conversorToCelsius() throws TempException {		
		Temperatura tempCelsius = new Celsius();
		Temperatura tempFahrenheit = new Fahrenheit();
		tempCelsius.setValue(celsius);
		tempFahrenheit.setValue(fahrenheit);
		
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		Temperatura temperaturaConvertida = conversorTemperatura.converte(tempFahrenheit);
		
		System.out.println("****Conversão de celsius para fahrenheit**** \nA temperatura em celsius: " + tempCelsius + " - A temperatura em fahrenheit: "
				+ tempFahrenheit);
		assertEquals(tempCelsius, temperaturaConvertida);
	}
	
}
