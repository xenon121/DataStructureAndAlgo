package algorithems.leetcode.interviewquestion.easy;

public class MoveZeros {
	
	public static void main(String[] args) {
		
		int[] nums = {1,0,0,0,0,3,13,0}; 
		
		int k = 0, j = 0, temp;
		
		while(k<nums.length && j<nums.length) {
			
			if(nums[k] != 0) {
				
				temp = nums[k];
				nums[k] = nums[j];
				nums[j] = temp;
				
				k++;
				j++;
				
			}else {
				k++;
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
