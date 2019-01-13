package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		int temp = Integer.MIN_VALUE;
		boolean hasSwapped = true;
		while(hasSwapped) {
			hasSwapped = false;
			temp = Integer.MIN_VALUE;
			for(int i = 0;i<arr.length;i++ ) {
				if(temp>arr[i]) {
					arr[i-1] = arr[i];
					arr[i] = temp;
					display.updateDisplay();
					hasSwapped = true;
				}
				temp = arr[i];
			}
		
		}
	}
	
}
