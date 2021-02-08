package algorithems.leetcode.interviewquestion.easy;

import java.util.Arrays;

public class IntersectionOfTwoArray2 {

	public static int[] getIntersectedData(int[] lowNums, int[] highNums) {
		
		if(lowNums[0] < highNums[0]) return new int[0];
		
		int highNumsTracker = 0, intersectArrSize = 0;
		int[] intersectNums = new int[lowNums.length];
		
		for(int i=0; i<lowNums.length; i++) {
			
			for(int j=highNumsTracker; j<highNums.length; i++) {
				
				if(lowNums[i] < highNums[j]) {
					i++;
					highNumsTracker = j;
					j = highNums.length;
					continue;
					
				}else if(lowNums[i] == highNums[j]) {
					
					intersectNums[intersectArrSize] = lowNums[i];
					intersectArrSize++;
					i++;
					highNumsTracker = j;
					j = highNums.length;
				}
			}
		}
		
		return intersectNums;
	}
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {1,1};
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int[] intersectNums = getIntersectedData(
				(nums1.length < nums2.length ? nums1 : nums2), 
				(nums1.length < nums2.length ? nums2 : nums1));
		
		for(int i = 0; i<intersectNums.length; i++) {
			System.out.println(i);
		}
		
		System.out.println("intersectNums: "+intersectNums.length);

	}

}
