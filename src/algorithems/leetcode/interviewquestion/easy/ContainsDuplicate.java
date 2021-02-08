package algorithems.leetcode.interviewquestion.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContainsDuplicate {

	public static boolean findIsDuplicate(int[] nums) {
		
		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					return true;
				}

			}
		}
		
		//long distinctCount = Arrays.stream(nums).distinct().count();
		
		//if(nums.length == distinctCount) return true;
		
		return false;
	}
	
	public static void main(String[] args) {

		// Input: [1,1,1,3,3,4,3,2,4,2]
		// Output: true
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,14,17,18,19,20,20};
		

		long distinctCount = Arrays.stream(nums).distinct().count();
		
		//System.out.println("old length: "+nums.length);
		//System.out.println("new length: "+distinctCount);
		
		long startTime = System.nanoTime();
		
		findIsDuplicate(nums);

		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
}
