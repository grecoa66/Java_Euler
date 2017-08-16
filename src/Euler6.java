/*
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * @Author: Alex Greco
 */
public class Euler6 {
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		System.out.println(run(100));
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
	
	public static int getSumOfSquares(int num){
		int total = 0;
		for(int i = 1; i <= num; i++){
			total += (i * i);
		}
		return total;
	}
	
	public static int getSquareOfSums(int num){
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		
		return sum * sum;
	}
	
	public static int run(int num){
		return getSquareOfSums(100) - getSumOfSquares(100);
	}
}
