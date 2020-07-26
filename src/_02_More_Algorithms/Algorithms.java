package _02_More_Algorithms;

import java.util.List;

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

	public static List<Double>  sortScores(List<Double> results) {
		List<Double> = results
		
		return 0.0;
	}
}
