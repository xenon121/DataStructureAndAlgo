package algorithems.leetcode.interviewquestion.easy;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "sandeep";
		char temp;
		char[] oprString = new char[str.length()];
		
		oprString = str.toCharArray();
		
		for(int i=0; i<oprString.length/2; i++) {
			
			temp = oprString[i];
			oprString[i] = oprString[(oprString.length - 1) - i];
			oprString[(oprString.length - 1) - i] = temp;
		}
		
		String revStr = String.copyValueOf(oprString);
		
		System.out.println(revStr);
	}

}
