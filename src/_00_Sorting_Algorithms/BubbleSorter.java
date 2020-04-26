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
			for (int i = 1; i < array.length; i++) {
				if (array[i] < (array[i - 1])) {
					fixed = false;
					switchOne = array[i];
					switchTwo = array[i - 1];
					array[i - 1] = switchOne;
					array[i] = switchTwo;
					display.updateDisplay();
				}

			}
		}
		display.updateDisplay();
	}
}
