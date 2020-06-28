package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = { "computer", "keyboard", "febreze", "battery", "pencil" };
		assertEquals(0, _00_LinearSearch.linearSearch(words, "computer"));
		assertEquals(1, _00_LinearSearch.linearSearch(words, "keyboard"));
		assertEquals(4, _00_LinearSearch.linearSearch(words, "pencil"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "microphone"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] words = { 1, 2, 4, 5, 7, 9, 11, 14, 17, 256, 1024, 999999 };
		assertEquals(0, _01_BinarySearch.binarySearch(words, 0, words.length - 1, 1));
		assertEquals(7, _01_BinarySearch.binarySearch(words, 0, words.length - 1, 14));
		assertEquals(11, _01_BinarySearch.binarySearch(words, 0, words.length - 1, 999999));
		assertEquals(10, _01_BinarySearch.binarySearch(words, 0, words.length - 1, 1024));
		assertEquals(-1, _01_BinarySearch.binarySearch(words, 0, words.length - 1, 2457));
	}

	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28 };
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(array, 2));
		assertEquals(7, _02_InterpolationSearch.interpolationSearch(array, 16));
		assertEquals(11, _02_InterpolationSearch.interpolationSearch(array, 24));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 154371245));
	}

	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = { 1, 2, 4, 5, 7, 9, 11, 14, 17, 256, 1024, 999999 };
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(array, 1));
		assertEquals(7, _03_ExponentialSearch.exponentialSearch(array, 14));
		assertEquals(11, _03_ExponentialSearch.exponentialSearch(array, 999999));
		assertEquals(10, _03_ExponentialSearch.exponentialSearch(array, 1024));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 2457));
	}
}
