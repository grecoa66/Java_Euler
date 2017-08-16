/*
 * Project Euler #1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Euler1 {
	

	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		System.out.println(findSum());

		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
	
	public static int findSum(){
		int totalSum;
		totalSum = 0;
		for(int i = 0; i < 1000; i++){
			if(i % 5 == 0 || i % 3 == 0){
				totalSum += i;
			}
		}
		return totalSum;
	}
}
