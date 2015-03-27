import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();

		while (i > 2) {
			if (i % 2 == 0) {
				System.out.println(i - 1);
				primes.add(i - 1);
			} else
				primes.add(i);
			i = (i + 1) / 2;
		}
		if (i == 2)
			primes.add(2);
		return primes;

	}
}
