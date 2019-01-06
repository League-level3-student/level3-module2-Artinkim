package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	static boolean intArraySorted(int[] arr) {
		int temp = Integer.MIN_VALUE;
		boolean sorted = true;
		for(int i = 0;i<arr.length;i++) {			
			if(temp >arr[i]) {
				sorted = false;
			}
			temp = arr[i];
		}
		return sorted;
		
	}
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	
	//2. Write a static method called doubleArraySorted. 
	static boolean doubleArraySorted(double[] arr) {
		double temp = Double.NEGATIVE_INFINITY;
		boolean sorted = true;
		for(int i =0;i<arr.length;i++) {
			if(temp>arr[i]) {
				sorted = false;
			}
			temp = arr[i];
		}
		return sorted;
	}
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	
	//3. Write a static method called charArraySorted. 
	static boolean charArraySorted(char[] arr) {
		char temp = 'a';
		boolean sorted = true;
		for(int i = 0;i<arr.length;i++) {
			if(temp >arr[i]) {
				sorted = false;
			}
		}
		return sorted;
	}
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	static boolean stringArraySorted(String[] arr) {
		boolean sorted = true;
		String temp = "";
		for(int i = 0;i<arr.length;i++) {
			if(temp.compareTo(arr[i])>0) {
					sorted = false;	
			}
			temp = arr[i];
		}
		return sorted;
	}
		
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
