package exercises;

public class PrimeCheck {
	public static void main(String[] args) {
		int candidate = Integer.parseInt(args[0]);
		int possibleFactor = (int)Math.ceil(Math.sqrt(candidate)) + 1;
		boolean factorFound = false;
		while(possibleFactor > 2 && factorFound == false) {
			possibleFactor--;
			if(candidate % possibleFactor == 0) {
				factorFound = true;
			}
			System.out.println("Possible factor " + possibleFactor + " : " + factorFound);
		}
		if(factorFound) {
			System.out.println("Factor of " + candidate + " was found: " + possibleFactor +"\n" + candidate + " is not prime.");
		}else {
			System.out.println("No factor of " + candidate + " was found.\n" + candidate + " is prime.");
		}
	}
	
	/*
	 * Possible Primes
	 * 27644437
	 */
}
