package com.perennialsys.primenumbers;

public class PrimeNumberWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primNumber(1, 15);
	}

	public static void primNumber(int start, int end) {

		if (start <= end) {
			primeNumberLoop(start, start);
			if (counter == 2) {
				System.out.println(start);
			}
			counter = 0;
			start++;
			primNumber(start, end);
		} else {
			System.out.println("");
		}
	}

	static int counter = 0;

	/**
	 * 
	 * 
	 * @param start
	 * @param num
	 */
	private static void primeNumberLoop(int start, int num) {
		if (num >= 1) {
			if (start % num == 0) {
				counter = counter + 1;
			}
			num--;
			primeNumberLoop(start, num);
		}

	}

}
