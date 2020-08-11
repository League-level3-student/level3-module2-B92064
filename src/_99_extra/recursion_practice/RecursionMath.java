package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
		//3. return number 
		if (times == 1) {
			return number;
		} else {
			return number + recursiveMultiplication(number, times - 1);
		}
		//4. else return number + recursionMultiplication(number, times-1)

	}

	//6. Try this one on your own! 
	//Hint: if numberToDivideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (numberToDivideBy > number) {
			return number;
		} else {
			return number / numberToDivideBy;
		}

	}

	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		
		if (power == 0) {
			
			return 1;

		} else {
			System.out.println("looped");
			
			return number * recursivePower(number, power-1);
		}

	}

	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(100, recursiveMultiplication(10, 10));
		assertEquals(45, recursiveMultiplication(9, 5));
		assertEquals(32, recursiveMultiplication(8, 4));
	}

	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(2, recursiveDivision(4, 2));
		assertEquals(10, recursiveDivision(100, 10));
		assertEquals(5, recursiveDivision(45, 9));
		assertEquals(4, recursiveDivision(32, 8));
	}

	@Test
	public void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(4, recursivePower(2, 2));
		assertEquals(64, recursivePower(2, 6));
		assertEquals(625, recursivePower(5, 4));
		assertEquals(2097152, recursivePower(8, 7));
	}

}
