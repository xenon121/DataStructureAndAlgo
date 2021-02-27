package algorithems.Tree2;

public class TreeOperations {

	public TreeNode insertData(Integer data, TreeNode treeNode) {
		
		if(treeNode == null) {
			treeNode = new TreeNode(data);
			
		}else {
			
			if(treeNode.getData() > data) {
				
				if(treeNode.getLeft() == null) {
					treeNode.left = new TreeNode(data);
					
				}else {
					insertData(data, treeNode.getLeft());
				}
				
			}else {
				
				if(treeNode.getRight() == null) {
					treeNode.right = new TreeNode(data);
					
				}else {
					insertData(data, treeNode.getRight());
				}
			}
		}
		
		return treeNode;
	}
	
	// InOrder: Left, root, right
	public void showInOrder(TreeNode treeNode) {
		
		if(treeNode.data != null) {
			
			if(treeNode.getLeft() != null) {
				showInOrder(treeNode.getLeft());
			}
			
			System.out.println(treeNode.getData());
			
			if(treeNode.getRight() != null) {
				showInOrder(treeNode.getRight());
			}
		}
		
	}

	// PreOrder: root, left, right
	public void showPreOrder(TreeNode treeNode) {
		
		if(treeNode.data != null) {
			
			System.out.println(treeNode.getData());
			
			if(treeNode.getLeft() != null) {
				showPreOrder(treeNode.getLeft());
			}
			
			if(treeNode.getRight() != null) {
				showPreOrder(treeNode.getRight());
			}
		}
		
	}
	
	// postOrder: left, right, root
	public void showPostOrder(TreeNode treeNode) {
		
		if(treeNode.data != null) {
			
			if(treeNode.getLeft() != null) {
				showPostOrder(treeNode.getLeft());
			}
			
			if(treeNode.getRight() != null) {
				showPostOrder(treeNode.getRight());
			}
			
			System.out.println(treeNode.getData());
		}
		
	}
	
}
