import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int candidate = 2;

		while (i > 1) {
			while (i % candidate == 0) {
				primes.add(candidate);
				i /= candidate;
			}
			candidate++;
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}

}
