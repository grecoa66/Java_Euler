/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * @Author: Alex Greco
 */
public class Euler5 {
	private static int num = 1;
	private static boolean solutionFound;

	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		System.out.println(run());
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
		
	}
	
	public static boolean isDivisable(int num){
		for(int i = 1; i <= 20; i++){
			if(num % i != 0 ){
				return false;
			}
		}
		return true;
	}
	
	public static int run(){
		while(!isDivisable(num)){
			num++;
		}
		
		return num;
	}
}
