package param.temperature;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConversorTemperaturaTest {
	 
	@Parameter(0)
	public double celsius;
	@Parameter(1)
	public double fahrenheit;

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 2.0, 35.6 }, { 10.0, 50.0 },
			{ 212.0, 100.0 }, { 500.0, 260.0 } 
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
		
		System.out.println("****Conversão de celsius para fahrenheit**** \nA temperatura em celsius: " + tempCelsius + " - A temperatura em fahrenheit: "
				+ tempFahrenheit);
		assertEquals(tempFahrenheit, temperaturaConvertida);
	}
	
	@Test
	public void conversorToCelsius() throws TempException {
		Temperatura tempCelsius = new Celsius();
		Temperatura tempFahrenheit = new Fahrenheit();
		tempCelsius.setValue(fahrenheit);
		tempFahrenheit.setValue(celsius);
		
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		Temperatura temperaturaConvertida = conversorTemperatura.converte(tempFahrenheit);
		
		System.out.println("****Conversão de fahrenheit para celsius**** \nA temperatura em fahrenheit: " + tempFahrenheit + " - A temperatura em celsius: "
				+ tempCelsius);
		
		assertEquals(tempCelsius, temperaturaConvertida);
	}
	
}
