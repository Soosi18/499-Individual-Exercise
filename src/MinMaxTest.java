import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxTest {

	@Test
	void testFindMin() {
		assertEquals(11, MinMax.findMin(new int[] {79, 22, 69, 85, 11}));
		assertEquals(54, MinMax.findMin(new int[] {67, 88, 56, 54, 70}));
	}
	
	@Test
	void testFindMax() {
		assertEquals(78, MinMax.findMax(new int[] {11, 56, 69, 78, 44}));
		assertEquals(81, MinMax.findMax(new int[] {42, 67, 71, 81, 2}));
	}

}
