package com.mkyong.hashing;

/**
 * Hello world Modi!
 *
 */
public class EvenOdd
{   


	public String evenOdd(int n) {
		String s = "";

		if (n % 2 == 0) {
			s = n + " is an even number";
		} else {
			s = n + " is an odd number";
		}

		return s;

	}


}
