package algorithems.leetcode.interviewquestion.easy;

public class ReverseCharacterArray {

	public static void main(String[] args) {
		
		//char[] s = {'h','e','l','l','o'};
		char[] s = {'H','a','n','n','a','h'};
		
		char temp;
		
		for(int i=0; i<s.length/2; i++) {
			
			temp = s[i];
			s[i] = s[(s.length-1)-i];
			s[(s.length-1)-i] = temp;
			
		}
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]);
		}

	}

}
