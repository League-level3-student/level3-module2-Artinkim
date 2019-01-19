package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class _00_MoreAndMoreTests {

	@Test
	public void MultTest() {

		assertEquals(0, multiply(10, 0));
		assertEquals(100, multiply(10, 10));
		assertEquals(88, multiply(8, 11));
	}

	int multiply(int i, int j) {
		return i * j;
	}

	@Test
	public void PrimeTest() {
		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	boolean isPrime(int num) {
		boolean r = true;
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				r = false;
			}
		}
		return r;
	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	private boolean isSquare(int num) {
		if (Math.pow(num, (.5)) == Math.round(Math.sqrt(num))) {
			return true;
		}
		return false;
	}

	@Test
	public void CubeTest() {

		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

	private boolean isCube(int num) {
		if (Math.cbrt(num) == Math.round(Math.cbrt(num))) { 
			return true;
		}
		return false;
	}
}
