package algorithems.leetcode.interviewquestion.medium;

import java.util.ArrayList;
import java.util.List;

public class ValidateSudoku {

	public static boolean innerMatrixCheck(int i, int j, int startOuter, int startInner, char[][] board) {
		
		for(int k=startOuter; k<(startOuter+3); k++) {
			
			for(int l=startInner; l<(startInner+3); l++) {
			
				if(k == i && l == j) continue;
				if(board[i][j] == board[k][l]) return false;
			}
		}
		
		return true;
	}
	
	public static boolean verticalMatrixCheck(int i, int j, char[][] board) {
		
		int k = i;
		
		while(k<board.length-1) {
			if(board[i][j] == board[++k][j]) return false;
		}
		
		return true;
	}
	
	public static void showSudoku(char[][] board) {
		
		for(int i = 0; i<board.length; i++) {
			
			List<String> showList = new ArrayList<String>();
			
			for(char c : board[i]) {
				showList.add(Character.toString(c));
			}
			
			System.out.println(showList);
			
		}	
	}
	
	public static void main(String[] args) {
		
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
							{'6','.','.','1','9','5','.','.','.'},
							{'.','9','8','.','.','.','.','6','.'},
							{'8','.','.','.','6','.','.','.','3'},
							{'4','.','.','8','.','3','.','.','1'},
							{'7','.','.','.','2','.','.','.','6'},
							{'.','6','.','.','.','.','2','8','.'},
							{'.','.','.','4','1','9','.','.','5'},
							{'.','.','.','.','8','.','.','7','9'}};
		
		
		final int[] j = {0};
		final int[] i = {0};
		
		boolean isValidSudoku = true;
		long horizontalLength = 0;
		
		int startOuter = 0, startInner = 0;
		
		showSudoku(board);
		
		for(i[0] = 0; i[0]<board.length; i[0]++) {
			
			List<String> charArrList = new ArrayList<String>();
			
			for(char c : board[i[0]]) {
				charArrList.add(Character.toString(c));
			}
			
			for(j[0] = 0; j[0]<board.length; j[0]++) {

				if(board[i[0]][j[0]] == '.') {
					continue;
				}
				
				horizontalLength = charArrList.stream().filter(l -> l.equalsIgnoreCase(Character.toString(board[i[0]][j[0]]))).count();
				
				if(horizontalLength > 1) {
					
					System.out.println("horizontal Matrinx failed...");
					isValidSudoku = false;
					i[0] = board.length;
					j[0] = board.length;
					break;
				}
				
				//-----------
				
				if(i[0]<3) {
					startOuter = 0;
					
				}else if(i[0]>=3 && i[0]<6) {
					startOuter = 3;
					
				}else if(i[0]>=6) {
					startOuter = 6;
				}
				
				if(j[0]<3) {
					startInner = 0;
					
				}else if(j[0]>=3 && j[0]<6) {
					startInner = 3;
					
				}else if(j[0]>=6) {
					startInner = 6;
				}
				
				isValidSudoku = innerMatrixCheck(i[0], j[0], startOuter, startInner, board);
				
				if(!isValidSudoku) {
					System.out.println("inner Matrinx failed...");
					i[0] = board.length;
					j[0] = board.length;
					break;
				}
				
				isValidSudoku = verticalMatrixCheck(i[0], j[0], board);
				
				if(!isValidSudoku) {
					System.out.println("vertical Matrinx failed...");
					i[0] = board.length;
					j[0] = board.length;
					break;
				}
				
			}
		
		}	
		
		System.out.println("isValidSudoku: "+isValidSudoku);
	}

}
