package _01_Searching_Algorithms;

public class _03_ExponentialSearch {
	
	// Exponential search is super efficient for large data sets by
	// optimizing the binary search. It, like the binary search, only
	// works with sorted data.
	
	//1. Complete the steps in the exponentialSearch method.
	//   We can assume that array is sorted.
	public static int exponentialSearch(int array[], int value)
	{
		if(array[0] == value) {
			return 0;
		}
		int counter = 1;
		while(counter<array.length && array[counter]<=value) {
			counter = counter*2;
		}
		int minimum;
		if(counter<array.length) {
			minimum = counter;
		} else {
			minimum = array.length-1;
		}
		return _01_BinarySearch.binarySearch(array, counter/2, minimum, value);
		// 2. Check if the array element at 0 is the value.
		//    If it is, then return 0.
		
		// 3. create an integer called counter and initialize it to 1;
		
		//4. make while loop that checks for two conditions:
		//    	counter is less than the length of the array,
		//		and the array element at counter is less than or equal to value
		
			//5. inside the while loop, double the value of counter.

		//6. create an integer called minimum
		
		//7. if counter is less than the length of the array,
		//   set minimum equal to counter
		
		//8. otherwise, set minimum equal to the length of the array minus 1.
	
		//9. use the binary search method you wrote using the following parameters:
		//		the array to be searched
		//		half of the counter
		//		minimum
		//		the value to be found
		
		//10. return the result
	}
}
