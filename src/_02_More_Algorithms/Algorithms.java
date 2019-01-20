package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0;i<eggs.size()-1;i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oy) {
		int r = 0;
		for(int i = 0;i<oy.size();i++) { 
			if(oy.get(i)) {
				r++;
			}
		}
		return r;
	}
	public static double findTallest(List<Double> peeps) {
		double tallestPerson = 0.0;
			for(int i = 0;i<peeps.size();i++) {
				if(tallestPerson<peeps.get(i)) {
					tallestPerson = peeps.get(i);
				}
			}
		return tallestPerson;
	}
	public static String findLongestWord(List<String> words) {
		String longest = "";
		for(int i = 0;i<words.size();i++) {
			if(longest.length()<words.get(i).length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
}
