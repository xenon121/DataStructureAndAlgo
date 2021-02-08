package algorithems.linkedlist;

public class LinkedListOperation {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(15);
		linkedList.insert(25);
		linkedList.insert(10);
		linkedList.insert(17);
		
		System.out.println("show after add --------------");
		linkedList.show();
		
		linkedList.insertAtStart(5);
		
		System.out.println("show after insertAtStart --------------");
		linkedList.show();
		
		linkedList.insertAt(0, 27);
		
		System.out.println("show after insertAt--------------");
		linkedList.show();
		
		linkedList.deleteAt(0);
		
		System.out.println("show after delete --------------");
		linkedList.show();
	}

}
