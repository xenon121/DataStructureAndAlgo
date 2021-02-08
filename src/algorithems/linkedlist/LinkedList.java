package algorithems.linkedlist;

public class LinkedList {

	private Node head;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void insert(int data) {
		
		Node node = new Node();
		node.setData(data);
		
		if(head == null) {
			head = node;
			
		}else {
			
			Node n = head;
			
			while(n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}		
	}
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	
	}
	
	public void show() {
		
		if(head != null) {
			
			Node n = head;
			
			while(n.getNext() != null) {
				
				System.out.println("data: "+n.getData());
				n = n.getNext();
			}
			
			System.out.println("data: "+n.getData());
		}
	}

	public void insertAt(int index, int data) {
		
		Node node = new Node();
		node.setData(data);		
		
		if(head == null) {
			insertAtStart(data);
			
		}else {
			
			Node n = head;
			
			if(index == 0) {
				insertAtStart(data);
				
			}else {
				
				for(int i=0; i<index-1; i++) {
					
					if(n.getNext() == null) {
						break;
					}
					
					n = n.getNext();			
				}
				
				Node nextNode = n.getNext();
				node.setNext(nextNode);
				n.setNext(node);
				
			}			
		}	
	}
	
	public void deleteAt(int index) {
		
		Node n = head;
		
		if(index == 0) {
			head = null;
			head = n.getNext();
		}
		
		for(int i=0; i<index-1; i++) {
			n = n.getNext();			
		}
		
		Node deleteNode = n.getNext();
		n.setNext(deleteNode.getNext());
		
		deleteNode = null;
		n = null;
		
	}
}
