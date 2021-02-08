package algorithems.queue;

public class Queue {

	// Still needs to work to make size of array dynamic
	
	private Integer arrLength = 5;
	
	public Queue() {
		
	}
	
	public Queue(int arrLength){
		this.arrLength = arrLength;	
	}
	
	private Integer[] queue = new Integer[arrLength];
	
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	
	public void enQueue(int data) {
		
		if(size >= arrLength) {
			System.out.println("Queue is full...");
			
		}else {
		
			queue[rear] = data;
			rear = (rear + 1) % arrLength;
			size++;
		}
	}
	
	public int deQueue() {
		
		Integer removedData = 0;
		
		if(isEmpty()) {
			System.out.println("Queue is empty...");
			
		}else {
			
			removedData = queue[front];
			front = (front + 1) % arrLength;
			size--;
		}
		
		return removedData;
	}
	
	public void show() {
		
		for(int i = 0; i < size; i++) {
			System.out.println(queue[(front + i) % arrLength]);		
		}	
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
}
