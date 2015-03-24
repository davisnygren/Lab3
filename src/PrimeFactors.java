import java.util.List;
import java.util.ArrayList;


public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(i > 1) {
			primes.add(2);
		}
		return primes;
	}
	
}
