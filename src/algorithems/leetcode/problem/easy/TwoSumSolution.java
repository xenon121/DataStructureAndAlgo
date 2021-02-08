package algorithems.leetcode.problem.easy;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        
        int[] sumIndex = new int[2];
        
        for(int i=0; i<nums.length-1; i++){
            
        	for(int j=i+1; j<nums.length; j++) {
        		
        		if((nums[i] + nums[j]) == target) {
        			
                    sumIndex[0] = i;
                    sumIndex[1] = j;
                    
                    break;
        		}
        	}
        	
            /*if((nums[i] + nums[i+1]) == target){
                
                sumIndex[0] = i;
                sumIndex[1] = i+1;
                
                break;
            }*/
        }
        
        return sumIndex;
    }
}
