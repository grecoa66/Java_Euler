/*
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Euler3 {
	public static long startNum = 600851475143L; 
	public static long largestFactorSoFar;
	
	public static void main(String[] args){		
		long startTime = System.currentTimeMillis();

		System.out.println(findBiggestPrime(startNum));

		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}

	public static boolean isPrime(long startNum2) {
		boolean isPrime = true;
		if(startNum2 % 2 == 0) return false;
		
		for(long i = 3; i * i <= startNum2; i = i+2){
			if(startNum2 % i == 0) return false;
		}
		return isPrime;
	}
	 public static long findBiggestPrime(long startNum){
		 for(long i = 3; i * i< startNum ; i= i+2){
			 if(isFactor(i)){
				 if(isPrime(i)){
					 largestFactorSoFar = i;
				 }
			 }
		 }
		 return largestFactorSoFar;
	 }
	 
	 public static boolean isFactor(long n){
		 if(startNum % n == 0) return true;
		 else return false;
	 }
}
