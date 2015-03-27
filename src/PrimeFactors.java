import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for (int candidate = 2; i > 1; candidate++) {
			while (i % candidate == 0) {
				primes.add(candidate);
				i /= candidate;
			}
		}
		return primes;
	}
}
