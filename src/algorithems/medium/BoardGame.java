package algorithems.medium;

/*
 * Board game is classic game where person has to reach place in minimum steps 
 * only two ways are there to move forward : x + 1 OR x * x : x represent start point.
 * suppose start point 2 and end point is 10 
 * x + 1 = 3 then x*x = 9 then x+1 = 10
 * as per above example we reached to end point in 3 steps.
 */
public class BoardGame {

	public static void main(String[] args) {
		// X: start point, Y: end point
		int X = 2, Y = 50;
		int steps = 0;

		int flag = Y;
		
		boolean hold = false;
		
		while(X!=Y) {
			
			if(hold) {
				X++;
				steps++;
				System.out.println("default add: "+X);
				
			}else {
				
				if((X*X) * (X*X) <= Y) {
					X = X*X;
					steps++;
					System.out.println("multiplied condition: "+X);
					
				}else if((X+1) * (X+1) <= Y) {
					X++;
					steps++;
					System.out.println("added condition: "+X);
					
				}else {
					hold = true;
					X = X*X;
					steps++;
					System.out.println("final multiplied: "+X);
				}
			}
		}
		
		System.out.println("final X: "+X);
		System.out.println("total steps: "+steps);
	}

}
