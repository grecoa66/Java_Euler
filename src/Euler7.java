/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * @Author: Alex Greco
 */
public class Euler7 {
	private static int count = 0;
	private static int num = 0;
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		System.out.println(run());
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
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

	public static int run(){
		
		while(count <10001){
			num++;
			if(isPrime(num)){
				count++;
			}
		}
		return num;
	}
}
