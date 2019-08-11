package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers s = new SumOfNumbers();
		int result1 = s.sumOfEvenNumbers(1,10);
		assertEquals(30,result1);
		int result2 = s.sumOfOddNumbers(1,10);
		assertEquals(25,result2);
	}

}
