package _02_More_Algorithms;

public class Checkpoint {
	public static void main(String[] args) {
		Double[] l = { 0.0, 4.0, 432.2, 44.3 };
		Checkpoint.sort(l);
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
		int[] l2 = 
		Checkpoint.find(arr, x) 
	}

	public static Double[] sort(Double[] list) {
		for (int i = 1; i < list.length; i++) {
			for (int j = i; j > 0; j--) {
				if (list[j] < list[j - 1]) {
					double temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
				}
			}
		}
		return list;
	}

	public static boolean find(int[] arr, int x) {
		boolean r = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				r = true;
			}
		}
		return r;
	}
}
