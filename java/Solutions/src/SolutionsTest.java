import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionsTest {

	@Test
	public void simpleTest() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {0, 1};
		int target = 5;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSum(inputArray,  target));
	}

	@Test
	public void testNoReuse() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {1, 2};
		int target = 6;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSum(inputArray,  target));
	}

	@Test
	public void testNotFound() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {-1, -1};
		int target = 14;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSum(inputArray,  target));
	}
	
	@Test
	public void simpleTestSmarter() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {0, 1};
		int target = 5;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSumSmarter(inputArray,  target));
	}

	@Test
	public void testNoReuseSmarter() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {1, 2};
		int target = 6;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSumSmarter(inputArray,  target));
	}

	@Test
	public void testNotFoundSmarter() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {-1, -1};
		int target = 14;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSumSmarter(inputArray,  target));
	}

	@Test
	public void simpleTestSmartest() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {0, 1};
		int target = 5;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSumSmartest(inputArray,  target));
	}

	@Test
	public void testNoReuseSmartest() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {1, 2};
		int target = 6;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSumSmartest(inputArray,  target));
	}

	@Test
	public void testNotFoundSmartest() {
		Solutions s = new Solutions();
		int[] expectedIndicies = new int[] {-1, -1};
		int target = 14;
		int[] inputArray = new int[] {3, 2, 4};
		assertArrayEquals(expectedIndicies, s.twoSumSmartest(inputArray,  target));
	}

}
