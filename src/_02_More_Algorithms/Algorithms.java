package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size() - 1; i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oy) {
		int r = 0;
		for (int i = 0; i < oy.size(); i++) {
			if (oy.get(i)) {
				r++;
			}
		}
		return r;
	}

	public static double findTallest(List<Double> peeps) {
		double tallestPerson = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (tallestPerson < peeps.get(i)) {
				tallestPerson = peeps.get(i);
			}
		}
		return tallestPerson;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (longest.length() < words.get(i).length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> list) {
		boolean r = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("... --- ...")) {
				r = true;
			}
		}
		return r;
	}

	public static List<Double> sortScores(List<Double> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(index) > list.get(j)) {
					index = j;
				}
			}
			double temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
		return list;
	}

	public static List<String> sortDNA(List<String> list) {
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (list.get(j).length() < list.get(j - 1).length()) {
					String temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
		return list;
	}

	public static List<String> sortWords(List<String> list) {
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (list.get(j - 1).compareTo(list.get(j)) > 0) {
					String temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
		System.out.println(list);
		return list;
	}
}
