import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionsTest {

	@Test
	public void simpleTwoSumTest() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[2];
		expectedIndicies[0] = 1; expectedIndicies[1] = 2;
		int target = 6;
		int[] inputArray = new int[3];
		inputArray[0] = 3;
		inputArray[1] = 2;
		inputArray[2] = 4;
		assertArrayEquals(expectedIndicies, s.twoSum(inputArray,  target));
	}

}
