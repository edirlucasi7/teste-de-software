package param;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionTest {

	private int expected;
	private int first;
	private int second;

	public AdditionTest(int expectedResult, int firstNumber,
			int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}

	@Parameters
	public static Object[][] addedNumbers() {
		return new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
			{ 7, 3, 4 }, { 9, 4, 5 }, };
	}

	@Test
	public void sum() {
		Addition add = new Addition();
		System.out.println("Addition with parameters : " + first + " and "
				+ second);
		assertEquals(expected, add.addNumbers(first, second));
	}

}