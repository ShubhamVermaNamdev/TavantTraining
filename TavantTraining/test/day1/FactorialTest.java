package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial fact = new Factorial();
		int result = fact.factorial(5);
		assertEquals(120,result);
	}

}
