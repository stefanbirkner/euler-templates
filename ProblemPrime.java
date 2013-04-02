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
}
