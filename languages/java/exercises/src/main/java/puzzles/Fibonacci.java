package puzzles;

public class Fibonacci {
	//Question taken from 
	//https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html
	
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		while(j<=100) {
			int temp = i+j;
			System.out.println(temp);
			i = j;
			j = temp;
		}
	}
}
