package algorithems.leetcode.problem.easy;

import java.util.Scanner;

public class TwoSum {
	
	public static void main(String[] args) {
	
		TwoSumSolution twoSumSolution = new TwoSumSolution();
		
		Scanner scan = new Scanner(System.in);
		
		int n, target;
		int[] solutionArr = new int[2];
		
		System.out.println("Enter total number of values: ");
		n = scan.nextInt();
		
		int[] valueArr = new int[n];
		
		System.out.println("Enter "+n+" values for array: ");
		for(int i=0; i<n; i++) {
			valueArr[i] = scan.nextInt();
		}
		
		System.out.println("Enter target value: ");
		target = scan.nextInt();
		
		solutionArr = twoSumSolution.twoSum(valueArr, target);
		
		for(int i=0; i<2; i++) {
			System.out.print(solutionArr[i]+"\t");
		}
	}
}
