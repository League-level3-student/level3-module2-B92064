package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean fixed = false;
		int switchOne;
		int switchTwo;

		while (!fixed) {
			fixed = true;
			for (int i = 0; i < array.length; i++) {
				if (i > 0) {
					if (array[i - 1] == array[i]) {
						continue;
					} else if (array[i] < (array[i - 1])) {
						fixed = false;
						switchOne = array[i];
						switchTwo = array[i - 1];
						array[2] = switchOne;
						array[1] = switchTwo;

					}
				}
			}
		}
		display.updateDisplay();
	}
}
