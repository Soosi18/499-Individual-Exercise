import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckRepeatingTest {
	
	@Test
	void testCheckRepeatingLetter() {
		assertEquals(true, CheckRepeating.checkRepeatingLetter(new char[] {'a', 'r', 'g', 'w', 'a'}));
		assertEquals(false, CheckRepeating.checkRepeatingLetter(new char[] {'w', 'p', 'x', 'v', 't'}));
	}
	

}
