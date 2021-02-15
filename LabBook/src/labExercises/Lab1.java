package labExercises;
import java.util.*;

public class Lab1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println(calculateSum(s.nextInt()));
//		System.out.println(calculateDifference(s.nextInt()));
//		System.out.println(checkNumber(s.nextInt()));
//		System.out.println(checkNumber2(s.nextInt()));
//		System.out.println(fibonacci(6));
//		primeNumbers(10);
		s.close();


	}
	static int sumOfCubes(int n) {
		/**
		 * Calculates the sum of cubes 
		 */
		int result=0;
		while(n>0) {
			result += Math.pow(n%10, 3);
		n/=10;	
		}
		return result;
	}
	
	static void primeNumbers(int n) {
		/**
		 * prints prime Numbers before the given number
		 */
		boolean[] pmList = new boolean[n+1];
		Arrays.fill(pmList, true);
		int s=2;
		while(s*s<=n) {
			if(pmList[s]) {
				for(int i=2*s;i<=n;i+=s)pmList[i]=false;
			}
			s++;
		}
		s=2;
		while(s<=n) {
			if(pmList[s])System.out.println(s++);
		}
	}
	
	static void trafficSimulation(String signal) {
		/**
		 * Traffic Light Simulation
		 * Enter red/yellow/green.
		 */
		if(signal.equalsIgnoreCase("red"))System.out.println("Stop");
		else if(signal.equalsIgnoreCase("yellow"))System.out.println("Ready");
		else if(signal.equalsIgnoreCase("green"))System.out.println("Go");
	}
	
	static long fibonacci(int n) {
		/**
		 * Calculate Fibonacci.
		 */
		if (n==1 || n==2) return 1;
		long prev=1;
		long res=2;
		n-=3;
		long temp=0;
		while(n-->0) {
			temp=res;
			res+=prev;
			prev=temp;
		}
		return res;
	}
	
	static int calculateSum(int n) {
		/**
		 * Calculate the sum of first n natural numbers which are divisible by 3 or 5.
		 */
		int sum=0;
		for(int i=3;i<=n;i++) if((i%3==0) || (i%5==0))sum+=i;
		return sum;
	}
	
	
	static int calculateDifference(int n) {
		/**
		 * difference between the sum of the squares of the first n natural numbers and the square of their sum
		 */
		
		int sumEachSquare=0;
		int sumWholeSquare=0;
		for(int i=1;i<=n;i++) {
			sumEachSquare+=Math.pow(i,2);
			sumWholeSquare+=i;
		}
		return sumEachSquare-(int)Math.pow(sumWholeSquare, 2);
	}
	
	
	static boolean checkNumber(int n) {
		/**Check if a number is an increasing number */
		
		int previousValue=n%10;
		while(n!=0) {
			if(previousValue<n%10)return false;
			previousValue=n%10;
			n/=10;
		}
		return true;
	}
	
	
	static boolean checkNumber2(int n) {
		/**Checks if the entered number is a power of two or not 		 */
		
		while(n>2)n/=2;
		return n==2;
	}
}
