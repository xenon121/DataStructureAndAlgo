package algorithems.leetcode.interviewquestion.easy;

import java.util.Arrays;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {
		
		//Input: nums = [1,2,3,4,5,6,7], k = 3
		//Output: [5,6,7,1,2,3,4]
		
		//Input: nums = [-1,-100,3,99], k = 2
		//Output: [3,99,-1,-100]
		
		int[] nums =  {1,2,3,4,5,6,7};
		int[] newNums = nums.clone();
		
		int k = 3, newIndex = 0;
		
		System.out.println("execution start");
		
		for(int i = 0; i < newNums.length; i++) {
			
			//System.out.println("i: "+i);
			//System.out.println("mod of i: "+((i+k)%(nums.length)));
			
			newIndex = (i+k)%(newNums.length);
			
			//System.out.println("\n newIndex: "+newIndex);
			
			System.out.println("rotated: "+newNums[i]);
			
			nums[newIndex] = newNums[i];
			
		}

		//nums = newNums;
				
		System.out.print("[ ");
		
		for(int j = 0; j < nums.length; j++) {
			
			System.out.print(", "+nums[j]);
			
		}
		
		System.out.print(" ]");
	}

	/*
    int[] newNums = nums.clone();
    int newIndex = 0;
	
	for(int i = 0; i < newNums.length; i++) {
		
		newIndex = (i+k)%(newNums.length);
		nums[newIndex] = newNums[i];
		
	}
	
	*/
	
	
}
