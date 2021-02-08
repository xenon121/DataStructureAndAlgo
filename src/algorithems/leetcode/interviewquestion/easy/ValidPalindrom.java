package algorithems.leetcode.interviewquestion.easy;

public class ValidPalindrom {

	public static boolean checkPalindrom(String s) {
		
		int j=s.length()-1;
		
		for (int i=0; i<s.length(); i++) {
			
			if(i >= j) {
				System.out.println("end point");
				break;
			}
			
			if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && 
					!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && 
					!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				
				System.out.println(s.charAt(i)+" - skipping: "+i);
				continue;
			}
			
			while((!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') && 
					!(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') && 
					!(s.charAt(j) >= '0' && s.charAt(j) <= '9')) && 
					j > i) {
				
				System.out.println(s.charAt(j)+" - skippingJ: "+j);
				--j;
			}
			
			if(!(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j)))) {
				return false;
				
			}else {
				--j;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		//String s = "ab2a";
		
		/*if(!(s.charAt(2) >= '0' && s.charAt(2) <= '9')) {
			System.out.println("out side");
		}else {
			System.out.println("in side");
		}*/
		
		
		System.out.println("palindrom: "+checkPalindrom(s));
	}

}
