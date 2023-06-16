package main;

import java.util.HashMap;

public class TwoSum {

	public static int[] sum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
//		HashMap<Integer,Integer> valToindex = new HashMap<>();
//
//
//		for(int i = 0 ; i < nums.length ; i++){
//		if(valToindex.containsKey(target - nums[i])){
//		return new int[] {valToindex.get(target - nums[i]), i};
//		}
//		valToindex.put(nums[i], i);
//		}
//		return nums;
		
		int res[] = new int[2];
        for (int i = 0; i < nums.length-1; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[j] + nums[i] == target)
                {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,2,3};
		int target = 6;
		
		
		int[] b = sum(a,target);
		System.out.println("Output: "+ b[0] + b[1]);
	}

	
}
