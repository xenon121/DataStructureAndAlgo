package algorithems.simple;

public class ReverseInt {

	public static void main(String[] args) {
		
		int value = 55643; //1534236469;2147483647
        int r, ans=0;
        
        int test = (int) (Math.pow(2, 31));

        //System.out.println("testing: "+test);
        
        
        //if(value >= Integer.MIN_VALUE && value <= (Integer.MAX_VALUE - 1)) {
        if(value >= Math.pow(-2, 31) && value <= (Math.pow(2, 31) - 1)) {
        	
            while(value != 0) {
            	
                r = value%10;
                value = value/10;
                
                ans = (ans*10) + r; 
            }
        	
        }else {
        	System.out.println("value size exceeded limit...");
        	value = 0;
        }

        System.out.println(ans);
	}

}
