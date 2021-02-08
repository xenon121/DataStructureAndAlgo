package algorithems.leetcode.interviewquestion.medium;

public class RotateImage {

	public static void showMatrix(int[][] matrix) {
		
		System.out.println(" --- show matrix --- ");
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j]+",");
			}
			
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		// [[1]]
		// {{1,2,3},{4,5,6},{7,8,9}}
		//Input: matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}
		//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
		
		//Input: matrix = {{1,2},{3,4}}
		//Output: [[3,1],[4,2]]
		
		//input: {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}
		// output: {{21,16,11,6,1},{22,17,12,7,2},{23,18,13,8,3},{24,19,14,9,4},{25,20,15,10,5}}
		
		//input: {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}}
		//output: {{31,25,19,13,7,1},{32,26,20,14,8,2},{33,27,21,15,9,3},{34,28,22,16,10,4},{35,29,23,17,11,5},{36,30,24,18,12,6}}

		int temp = 0;
		
		showMatrix(matrix);
		
	    int n = matrix.length;
	    for (int i = 0; i < (n + 1) / 2; i ++) {
	      for (int j = 0; j < n / 2; j++) {
	        temp = matrix[n - 1 - j][i];
	        
	        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
	        matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
	        matrix[j][n - 1 - i] = matrix[i][j];
	        matrix[i][j] = temp;
	      }
	    }
		
	    System.out.println(" matrix rotated.....");
		showMatrix(matrix);
			
	}
}
