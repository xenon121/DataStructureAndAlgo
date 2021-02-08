package algorithems.Tree;

public class BinarySearchTree {

	public static void main(String[] args) {
		
		Node tree = new Node();
		
		tree.insert(4);
		tree.insert(2);
		tree.insert(5);
		tree.insert(6);
		tree.insert(3);
		tree.insert(1);
		
		System.out.println("InOrder search...");
		tree.showInOrder();
		
		System.out.println("PreOrder search...");
		tree.showPreOrder();
		
		System.out.println("PostOrder search...");
		tree.showPostOrder();
		
		System.out.println("contains: "+tree.contains(6));
		
	}
}
