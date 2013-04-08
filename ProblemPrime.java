import java.util.*;

public class ProblemX {
	public static void main(String... args) {
		System.out.println();
	}

	private static boolean isPrime(int number) {
		if (number == 2)
			return true;
		else if (number % 2 == 0)
			return false;
		else
			for (int divisor = 3; divisor < number; divisor += 2)
				if (number % divisor == 0)
					return false;
		return true;
	}

	//Sieve of Eratosthenes
	private static List<Integer> getAllPrimesBelow(int limit) {
		boolean[] primes = new boolean[limit - 1];
		primes[2] = true;
		for (int i = 3; i < primes.length; i += 2)
			primes[i] = true;
		int prime = 3;
		while ((prime * prime) < limit) {
			discardMultiples(primes, prime);
			prime = getNextPrime(primes, prime);
		}
		return convertToListOfPrimes(primes);
	}

	private static void discardMultiples(boolean[] primes, int prime) {
		int start = prime * prime;
		for (int i = start; i < primes.length; i += prime)
                        primes[i] = false;
	}

	private static int getNextPrime(boolean[] primes, int prime) {
		for (int i = prime + 1; ; ++i)
			if (primes[i] == true)
				return i;	
	}

	private static List<Integer> convertToListOfPrimes(boolean[] primeFlags) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 0; i < primeFlags.length; ++i)
			if (primeFlags[i])
				primes.add(i);
		return primes;
	}
}
