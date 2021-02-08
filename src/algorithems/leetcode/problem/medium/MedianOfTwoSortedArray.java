package algorithems.leetcode.problem.medium;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3};
		int[] arr2 = {2};
		int tracker = 0;
		int i,j;
		float median;
		
		int[] mergedArr = new int[(arr1.length + arr2.length)];
		
		for(i=0; i < arr1.length; i++) {
			mergedArr[i] = arr1[i];
		}
		
		for(j=(arr1.length); j < (mergedArr.length); j++) {
			
			mergedArr[j] = arr2[tracker];
			tracker++;
			
		}
		
		for (i = 0; i < mergedArr.length; i++) {
			System.out.println("before merged Array: "+mergedArr[i]);
		}
		
		int temp;
		for (i = 0; i < mergedArr.length-1; i++) {
			
			for(j = (i+1); j < mergedArr.length; j++) {
				
				if(mergedArr[i] > mergedArr[j]) {
					temp = mergedArr[i];
					mergedArr[i] = mergedArr[j];
					mergedArr[j] = temp;
				}
			}
		}
		
		for (i = 0; i < mergedArr.length; i++) {
			System.out.println("after merged Array: "+mergedArr[i]);
		}
		
		float medianIndex = ((float) mergedArr.length/2);
		
		System.out.println("length: "+(mergedArr.length));
		System.out.println("median index: "+medianIndex);
		
		boolean isDecimalZero = ((medianIndex - (int) medianIndex) == 0);
		
		System.out.println("isDecimalZero: "+isDecimalZero);
		
		System.out.println("floated data: "+(medianIndex - (int) medianIndex));
		
		if(isDecimalZero) {
			median = ((float) mergedArr[((int) medianIndex) - 1] + mergedArr[((int) medianIndex)]) / 2;
			
		}else {
			median = mergedArr[((int) medianIndex)];
		}
		
		System.out.println("median: "+median);
		
	}

}
