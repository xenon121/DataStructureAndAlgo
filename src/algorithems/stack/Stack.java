package algorithems.stack;

public class Stack {

	Stack(){
		
	}
	
	int[] stack = new int[5];
	int top = 0;
	
	public void push(int data) {
		
		if(top >= 5) {
			System.out.println("Stack is full...");
			
		}else {
			stack[top] = data;
			top++;
		}
		
	}
	
	public void show() {
		
		for(int n : stack) {
			System.out.println(n);
		}		
		
	}
	
	public int pop() {
		
		if(top <= 0) {
			System.out.println("Stack is empty...");

		}else {
			
			top--;
			
			int popedData = stack[top];
			stack[top] = 0;
			
			return popedData;
		}
		
		return 0;
		
	}
	
	public Integer peek() {
		return stack[top-1];
	}
	
	public int size() {
		return top; 
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	
}
