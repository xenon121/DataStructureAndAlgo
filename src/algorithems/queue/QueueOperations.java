package algorithems.queue;

public class QueueOperations {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		System.out.println(" -- before deletion --");
		
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(3);
		queue.enQueue(13);
		queue.enQueue(7);
		queue.enQueue(7);
		
		queue.show();
		
		System.out.println(" -- after deletion --");
		
		queue.deQueue();

		queue.show();
		
		System.out.println(" -- after adding one more value --");
		
		queue.enQueue(8);
		
		queue.show();
		
		queue.enQueue(15);

	}

}
