/*
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * @author Alex Greco
 */
public class Euler10 {
	private static long currNum = 0;
	private static long sum = 0;
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		System.out.println(run());
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime)
				+ " milliseconds");
	}
	
	public static long run(){
		while(currNum <= 2000000){
			if(isPrime(currNum)){
				sum += currNum;
			}
			currNum++;
		}
		return sum;
	}

	public static boolean isPrime(long startNum2) {
		boolean isPrime = true;
		if (startNum2 % 2 == 0)
			return false;

		for (long i = 3; i * i <= startNum2; i = i + 2) {
			if (startNum2 % i == 0)
				return false;
		}
		return isPrime;
	}
}
