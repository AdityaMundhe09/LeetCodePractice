package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] sum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map = new HashMap<>();
		
		
		for(int i=0;i<nums.length-1;i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);
		}
	
		
		return nums;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,7,11,15};
		int target = 9;
		
		System.out.println("Output: "+sum(a,target));
	}

	
}
