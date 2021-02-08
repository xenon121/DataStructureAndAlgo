package games.practices;

import java.util.Scanner;

public class BatmanJumpsToStopBomb {

    public static int getClosestX(int xAxis, int width){

        if(xAxis > width){

            if(xAxis/2 > 0 && xAxis/2 >= width){
                xAxis = xAxis/2;
                return getClosestX(xAxis, width);

            }else{
                return xAxis;
            }

        }else if(xAxis < width){

            if(xAxis*2 <= width){
                xAxis = xAxis*2;
                return getClosestX(xAxis, width);
            }else {
                return xAxis;
            }

        }else{
            return xAxis;
        }
    }

    public static int getClosestY(int yAxis, int height){

        if(yAxis > height){

            System.err.println("y is greater height...");
            if(yAxis/2 > 0 && yAxis/2 > height){
                yAxis = yAxis/2;
                return getClosestY(yAxis, height);

            }else{
                return yAxis;
            }

        }else if(yAxis < height){

            System.err.println("y is smaller height...");
            if(yAxis*2 < height){
                yAxis = yAxis*2;
                return getClosestY(yAxis, height);
            }else {
                return yAxis;
            }

        }else{
            return yAxis;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter building width: ");
        int W = in.nextInt(); // width of the building.
        
        System.out.print("Enter building height: ");
        int H = in.nextInt(); // height of the building.
        
        System.out.print("Enter maximum turns: ");
        int N = in.nextInt(); // maximum number of turns before game over.
        
        System.out.print("Enter batman X position: ");
        int X0 = in.nextInt();
        
        System.out.print("Enter batman Y position: ");
        int Y0 = in.nextInt();
        int n = 0;
        
        float test = 20/3;
        
        System.out.println("test: "+test);
        
        int testInt = (int) test;
        
        System.out.println("testInt: "+testInt);
        
        // game loop
        while (true) {
        	//System.out.println("Enter bomb Direction...");
            //String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

        	String 	bombDir;
        	
            System.err.println("width: "+W);
            System.err.println("height: "+H);
            System.err.println("turns: "+N);
            System.err.println("x axis: "+X0);
            System.err.println("y axis: "+Y0);

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            X0 = getClosestX(X0, W);
            Y0 = getClosestY(Y0, H);

            System.err.println("x axis - after function: "+X0);
            System.err.println("y axis - after function: "+Y0);
        	
            bombDir = "";
            
        	if(H >= Y0) {
        		bombDir = bombDir + "D";
        		
        	}else {
        		bombDir = bombDir + "U";
        	}
        	
        	if(W >= X0) {
        		bombDir = bombDir + "R";
        		
        	}else {
        		bombDir = bombDir + "L";
        	}
            
        	System.out.println("BombDir set....: "+bombDir);
        	
            if(bombDir.contains("D") && Y0 != H){
                Y0++;
                System.err.println("y axis - changed: "+Y0);
            }

            if(bombDir.contains("U") && Y0 != H){
                Y0--;
                System.err.println("y axis - changed: "+Y0);
            }

            if(bombDir.contains("R") && X0 != W){
                X0++;
                System.err.println("x axis - changed: "+X0);
            }

            if(bombDir.contains("L") && X0 != W){
                X0--;
                System.err.println("x axis - changed: "+X0);
            }

            // the location of the next window Batman should jump to.
            System.out.println(X0+" "+Y0);
            
            System.out.println("N - "+N);
            N--;
            
            if(X0 == W && Y0 == H) {
            	System.out.println("Bomb defused...");
            	break;
            	
            }else if(N<=0) {
            	System.out.println("Bomb gone boom... failed");
            	break;
            }
            
        }
    }

}
