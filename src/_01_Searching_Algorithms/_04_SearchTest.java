package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] list = {"carrot", "pineapple", "mango", "pear"};
		String[] list2 = {"apple", "banana", "carrot", "grape"};
		
		assertEquals(_00_LinearSearch.linearSearch(list,"mango"),2);
		assertEquals(_00_LinearSearch.linearSearch(list2,"banana"),1);
		assertEquals(_00_LinearSearch.linearSearch(list2,"grape"),3);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		String[] list = {"apple", "banana", "carrot", "grape"};
		
		assertEquals(_00_LinearSearch.linearSearch(list,"banana"),1);
		assertEquals(_00_LinearSearch.linearSearch(list,"grape"),3);
		assertEquals(_00_LinearSearch.linearSearch(list,"apple"),0);

	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
