package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void test() {
		MarkValidator mark = new MarkValidator();
		boolean result1 = mark.isPass(80);
		assertEquals(true,result1);
		
		String result2 = mark.markGrade(80);
		assertEquals("Pass With Grade B",result2);
	}

}
