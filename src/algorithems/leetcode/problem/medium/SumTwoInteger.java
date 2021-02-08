package algorithems.leetcode.problem.medium;

/**
 * 
 * @author XenonScythe
 * sum of two integer without using + and - operator.
 *
 */
public class SumTwoInteger {

    static int Add(int x, int y) 
    { 
        // Iterate till there is no carry
    	int count = 0;
        while (y != 0)  
        { 
        	System.out.println("........count: "+(++count));
        	System.out.println("x: "+x);
        	System.out.println("y: "+y);
        	
            // carry now contains common 
            // set bits of x and y 
            int carry = x & y; 
            System.out.println("carry: "+carry);
            // Sum of bits of x and  
            // y where at least one  
            // of the bits is not set 
            x = x ^ y; 
            System.out.println("x = x ^ y: "+x);
            // Carry is shifted by  
            // one so that adding it  
            // to x gives the required sum 
            y = carry << 1;
            
            System.out.println("y = carry << 1: "+y);
        } 
        return x; 
    } 
      
    // Driver code 
    public static void main(String arg[])  
    { 
    	int c, a=60, b=13;
    	System.out.println("bitwise OR test: "+(a = a ^ b));
        System.out.println(Add(60, 13)); 
    } 

}
