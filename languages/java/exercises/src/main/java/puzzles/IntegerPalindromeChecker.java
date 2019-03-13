package puzzles;

public class IntegerPalindromeChecker {

	public boolean check(int candidate) {
		int temp = candidate;
        int flip = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            flip = flip * 10 + remainder;
            temp = temp / 10;
        }
        return candidate == flip;
	}
}
