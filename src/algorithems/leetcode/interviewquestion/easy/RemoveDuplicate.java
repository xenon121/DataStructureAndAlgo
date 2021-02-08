package algorithems.leetcode.interviewquestion.easy;

public class RemoveDuplicate {

	public static int removeDuplicateFromSortedArray(int[] nums) {
		
		if(nums.length == 0) {
			return 0;
		}
		
		int i = 0;
		
		for(int j = 1; j < nums.length; j++) {
			
			if(nums[j] != nums[i]) {
				i++;
				System.out.println("i: "+nums[i]);
				nums[i] = nums[j];
				System.out.println("index i: "+i+" -- index j: "+j);
			}
		}
		
		for(int j = 0; j < nums.length; j++) {
			System.out.println("new array: "+nums[j]);
		}
		
		return i + 1;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		//int[] nums = {1,1,2};
		System.out.println("length: "+nums.length);
		

		System.out.println("size: "+removeDuplicateFromSortedArray(nums));
	}

}
