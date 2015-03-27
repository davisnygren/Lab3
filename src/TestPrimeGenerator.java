import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPrimeGenerator {
	private Integer inputNumber;
	private List expectedResult;
	
	private static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	public TestPrimeGenerator(Integer inputNumber, 
			List expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
				{1, list()},
				{2, list(2)},
				{3, list(3,2)},
				{4, list(3,2)},
				{5, list(5,3,2)}
		});
	}
	
	@Test
	public void testOne() {
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, PrimeGenerator.generate(inputNumber));
	}
}
