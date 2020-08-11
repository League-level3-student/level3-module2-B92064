package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "short";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		boolean SOS = false;
		for (int i = 0; i < message.size(); i++) {
			if (message.contains("... --- ...")) {
				SOS = true;
			}
		}
		return SOS;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean sorted = false;
		double first = 0.0;
		double second = 0.0;
		ArrayList<Double> list = new ArrayList<Double>();
		for (int i = 0; i < results.size(); i++) {
			list.add(results.get(i));
		}
		while (sorted == false) {
			sorted = true;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) > list.get(i)) {
					sorted = false;
					first = list.get(i - 1);
					second = list.get(i);
					list.set(i - 1, second);
					list.set(i, first);
				}
			}
		}
		return list;
	}

	public static List<String> sortDNA(List<String> uS) {

		boolean sorted = false;
		String first = new String();
		String second = new String();
		ArrayList<String> sorter = new ArrayList<String>();

		for (int i = 0; i < uS.size(); i++) {
			sorter.add(uS.get(i));
		}
		while (sorted == false) {
			sorted = true;
			for (int i = 1; i < sorter.size(); i++) {
				if (sorter.get(i - 1).length() > sorter.get(i).length()) {
					sorted = false;
					first = sorter.get(i - 1);
					second = sorter.get(i);
					sorter.set(i - 1, second);
					sorter.set(i, first);
				}
			}
		}
//		System.out.println(sorter);
		return sorter;

	}

}
