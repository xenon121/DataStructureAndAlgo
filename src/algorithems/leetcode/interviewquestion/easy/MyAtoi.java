package algorithems.leetcode.interviewquestion.easy;

public class MyAtoi {

	public static void main(String[] args) {
		
		String s = "-4193 with words";
		char temp;
		int digits = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			temp = s.charAt(i);
			
			if(temp == '-' || temp == '+' || temp == '.') {
				digits = digits + temp;
				System.out.println("test");
				
			}else if(temp >= '0' && temp <= '9'){
				digits = (digits * 10) + Integer.parseInt(Character.toString(temp));
				System.out.println(digits);
			}
			else {
				break;
			}	
		}
		
		System.out.println("digits: "+digits);
		
	}
}
