/*
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), 
 * it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 */
public class Euler14 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		System.out.println(run());

		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime)
				+ " milliseconds");
	}

	public static long run() {
		long numWithMostSteps = 0;
		long curNum = 13;
		int maxNumSteps = 0;
		while (curNum < 1000000) {
			//use this num to do all operations on
			long tempNum = curNum;
			//how many steps until tempNum reaches 1
			int curNumSteps = 0;
			
			while (tempNum != 1) {
				if (tempNum % 2 == 0) {
					tempNum = tempNum / 2;
					curNumSteps++;
				}else{
					tempNum = (3 * tempNum) + 1;
					curNumSteps++;
				}
			}
			if(curNumSteps > maxNumSteps){
				maxNumSteps = curNumSteps;
				numWithMostSteps = curNum;
			}
			curNum++;
		}
		System.out.println("Num Steps: " + maxNumSteps); 
		return numWithMostSteps;
	}
}
