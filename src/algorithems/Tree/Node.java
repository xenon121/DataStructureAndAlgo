package algorithems.Tree;

public class Node {

	private Node left, right;
	private Integer data = null;
	
	public Node() {
		
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		
		if(data == null) {
			data = value;
			
		}else {
			
			if(value <= data) {
				
				if(left == null) {
					left = new Node(value);
					
				}else {
					left.insert(value);
				}
				
			}else {
				
				if(right == null) {
					right = new Node(value);
					
				}else {
					right.insert(value);
				}
			}
		}
	}
	
	public boolean contains(int value) {
		
		if(isEmpty()) {
			return false;
		}
		
		if(value == data) {
			return true;	
		}
		
		if(value < data) {
			
			if(left == null) {
				return false;
				
			}else {
				return left.contains(value);
			}
			
		}else {
			
			if(right == null) {
				return false;
				
			}else {
				return right.contains(value);
			}		
		}
	}
	
	public void showInOrder() {
		
		// InOrder: LEFT_ROOT_RIGHT
		
		if(!isEmpty()) {
			
			if(left != null) {
				left.showInOrder();
			}
			
			System.out.println(data);
			
			if(right != null) {
				right.showInOrder();
			}	
		}
	}
	
	public void showPreOrder() {
		
		// PreOrder: ROOT_LEFT_RIGHT
		
		if(!isEmpty()) {
			
			System.out.println(data);
			
			if(left != null) {
				left.showPreOrder();
			}
			
			if(right != null) {
				right.showPreOrder();
			}
		}
	}
	
	public void showPostOrder() {
		
		// PostOrder: LEFT_RIGHT_ROOT
		
		if(!isEmpty()) {
			
			if(left != null) {
				left.showPostOrder();
			}
			
			if(right != null) {
				right.showPostOrder();
			}
			
			System.out.println(data);
		}
		
	}
	
	public boolean isEmpty() {
		
		if(data == null) {
			System.out.println("Tree is empty... ");
			return true;
		}
		
		return false;
	}
	
}
