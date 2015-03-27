import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		boolean primeArr[] = new boolean[30];
		
		//start with numbers from 2 to i
		for(int j=2; j<i; j++) {
			primeArr[j] = true;
		}
		
		//remove nonprimes
		for(int a=2; a<=i; a++) {
			if(primeArr[a]) {
				for(int b = a*a; b<=i; b+=a) {
					primeArr[b] = false;
				}
			}
		}
		
		//convert the array into an arraylist of the primes	
		for(int j=0; j<i; j++) {
			if(primeArr[j])
				primes.add(j);
		}
		
		return primes;

	}
}
