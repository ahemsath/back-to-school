public class Solutions {

	public int[] twoSum(int[] nums, int target) {
		int[] returnArray = new int[] {-1, -1};
		for(int i = 0; i<nums.length; i = i + 1) {
			for(int j = 0; j<nums.length; j = j + 1) {
				if (i == j) {
					continue;
				}
				if (nums[i] + nums[j] == target) {
					returnArray[0] = i;
					returnArray[1] = j;
					return returnArray;
				}
			}
		}
		return returnArray;
	}
}
