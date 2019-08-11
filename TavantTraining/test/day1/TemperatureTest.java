package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temp = new Temperature();
		double actual1 = temp.convertToFarenheit(30.0);
		double expected1 = 86.0;
		assertEquals(actual1,expected1);
		
		double actual2 = temp.convertToCelsius(50.0);
		double expected2 = 10.0;
		assertEquals(actual2,expected2);
	}

}
