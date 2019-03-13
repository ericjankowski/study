package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import puzzles.IntegerPalindromeChecker;

class IntegerPalindromeCheckerTest {

	@Test
	void isPalindrome_1() {
		IntegerPalindromeChecker checker = new IntegerPalindromeChecker();
		
		assertTrue(checker.check(1));
	}
	
	@Test
	void isNotPalindrome_10() {
		IntegerPalindromeChecker checker = new IntegerPalindromeChecker();
		
		assertFalse(checker.check(10));
	}
	
	@Test
	void isPalindrome_101() {
		IntegerPalindromeChecker checker = new IntegerPalindromeChecker();
		
		assertTrue(checker.check(101));
	}
	
	@Test
	void isPalindrome_1001() {
		IntegerPalindromeChecker checker = new IntegerPalindromeChecker();
		
		assertTrue(checker.check(1001));
	}
	
	@Test
	void isPalindrome_1221() {
		IntegerPalindromeChecker checker = new IntegerPalindromeChecker();
		
		assertTrue(checker.check(1001));
	}

}
