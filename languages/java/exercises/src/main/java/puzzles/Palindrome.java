package puzzles;

public class Palindrome {
	//Taken from
	//https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html
	public static void main(String[] args) {
		String target = args[0];
		int i = 0;
		int j = target.length() - 1;
		boolean palindrome = true;
		while(i < j && palindrome) {
			if(target.charAt(i) != target.charAt(j)) {
				palindrome = false;
			}
			i++;
			j--;
		}
		if(palindrome) {
			System.out.println(target + " is a palindrome.");
		}else {
			System.out.println(target + " is not a palindrome.");
		}
	}
	
	//Candidates
	// ewe
	// rev
	// trert
	// tyyt
	// amanaplanacanalpanama
	// palindrome
}
