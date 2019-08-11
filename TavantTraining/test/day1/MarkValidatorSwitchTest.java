package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchTest {

	@Test
	void test() {
		MarkValidatorSwitch mark = new MarkValidatorSwitch();
		String result = mark.markGrade(80);
		assertEquals("Grade B",result);
	}

}
