import java.util.ArrayList;
import java.util.List;


public class PrimeGenerator {
	
	
	
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if(i>2) {
			primes.add(3);
			i = (i+1)/2;
		}
		if(i == 2)
			primes.add(2);
		return primes;
		
	}
}
