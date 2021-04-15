package param.temperature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConversorTemperaturaFahrenheitTest {

	@Parameter(0)
	public double celsius;
	@Parameter(1)
	public double fahrenheit;
	

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 2.0, 35.6 }, { 10.0, 50.0 },
		});
	}
	
	@Test
	public void conversorToFahrenheit() throws TempException {
		Temperatura tempCelsius = new Celsius();
		Temperatura tempFahrenheit = new Fahrenheit();
		tempCelsius.setValue(celsius);
		tempFahrenheit.setValue(fahrenheit);
		
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		Temperatura temperaturaConvertida = conversorTemperatura.converte(tempCelsius);
		
		System.out.println("****Conversão de fahrenheit para celsius**** \nA temperatura em fahrenheit: " + tempFahrenheit + " - A temperatura em celsius: "
				+ tempCelsius);
		
		assertEquals(tempFahrenheit, temperaturaConvertida);
	}
	
}
