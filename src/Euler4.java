/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Euler4 {
	public static int currLargest = 0;
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		System.out.println(findBiggestPalindrom());

		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
		
	}

	public static boolean isPalindrom(int n) {
		int nLength = String.valueOf(n).length();
		for (int i = 0; i < (nLength/2) + 1; i++) {
			String frontNum = String.valueOf(n).substring(i, i+1);
			String backNum = String.valueOf(n).substring(nLength - (i + 1), nLength - i);
			if(!(frontNum.equals(backNum))){
				return false;
			}
		}
		return true;
	}
	
	public static int findBiggestPalindrom(){
		for(int i = 100; i < 1000; i++){
			for(int j = 100; j < 1000; j++){
				int testNum = i * j;
				if(isPalindrom(testNum)){
					if(testNum > currLargest){
						currLargest = testNum;
					}
				}
			}
		}
		return currLargest;
	}
}
