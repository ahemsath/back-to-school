import java.util.*;
import java.lang.Math.*;

public class Solutions {

	public int[] twoSum(int[] nums, int target) {
		int[] returnArray = new int[] {-1, -1};
		// simple, O(n^2) approach
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

	public int[] twoSumSmarter(int[] nums, int target) {
		int[] returnArray = new int[] {-1, -1};
		Map<Integer, Integer> map = new HashMap<>();
		// Pass one: just stuff everything into the map
		for(int i = 0; i<nums.length; i = i + 1) {
			map.put(new Integer(nums[i]), new Integer(i));
		}
		// Now go back through the array and look for the correct complement in the map
		for(int i = 0; i<nums.length; i = i + 1) {
				Integer neededComplement = new Integer(target - nums[i]);
				if (map.containsKey(neededComplement)) {
					int indexOfComplement = map.get(neededComplement).intValue();
					if (indexOfComplement != i) {
						returnArray[0] = i;
						returnArray[1] = indexOfComplement;
						return returnArray;
					}
				}
		}
		return returnArray;
	}

	public int[] twoSumSmartest(int[] nums, int target) {
		int[] returnArray = new int[] {-1, -1};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<nums.length; i = i + 1) {
			map.put(new Integer(nums[i]), new Integer(i));
			// Oh, wait...why not go ahead and look for the complement right away?
			Integer neededComplement = new Integer(target - nums[i]);
			if (map.containsKey(neededComplement)) {
				int indexOfComplement = map.get(neededComplement).intValue();
				if (indexOfComplement != i) {
					// One difference here is that we need to make the order correct (lower index first, then higher)
					// Since the indexes are ordered and can't be the same, just take the min and max
					returnArray[0] = Math.min(i, indexOfComplement);
					returnArray[1] = Math.max(i, indexOfComplement);
					return returnArray;					
				}
			}
		}
		return returnArray;
	}

}	
