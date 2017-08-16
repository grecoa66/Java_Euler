/*
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * @author Alex Greco
 */
public class Euler9 {
	
	public static int sum = 0;

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		System.out.println(run());
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime)
				+ " milliseconds");
	}
	
	private static String run(){
		int a = 1;
		int b = 2;
		int c = 3;
		boolean found = false;
		while(found != true){
			for(b = 2; b < c; b++){
				for(a = 1; a < b; a++){
					if(isPythagTriplet(a, b, c)){
						sum = (a + b + c);
						if(sum == 1000){
							return a + " + " + b + " + " + c + " = " +  sum;
						}
					}
				}
			}
			c++;
		}
		return a + " + " + b + " + " + c + " = " +  sum;
	}
	
	private static boolean isPythagTriplet(int a, int b, int c){
		int aSqr = a * a;
		int bSqr = b * b;
		int cSqr = c * c;
		if((aSqr + bSqr) == cSqr){
			return true;
		}else{
			return false;
		}
	}
}
