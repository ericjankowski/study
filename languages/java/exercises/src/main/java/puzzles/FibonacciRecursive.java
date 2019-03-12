package puzzles;

public class FibonacciRecursive {
	
	//Question taken from 
	//https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html
	
	public static void main(String[] args) {
		fibonacci(0,1);
	}

	private static void fibonacci(int i, int j) {
		if(j>100) {
			return;
		}
		System.out.println(i + j);
		fibonacci(j, i+j);
	}
}