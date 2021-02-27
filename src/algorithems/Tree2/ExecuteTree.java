package algorithems.Tree2;

public class ExecuteTree {

	public static void main(String[] args) {
		
		TreeOperations treeOperations = new TreeOperations();
		
		TreeNode treeNode = null;
		
		treeNode = treeOperations.insertData(5, treeNode);
		treeNode = treeOperations.insertData(2, treeNode);
		treeNode = treeOperations.insertData(1, treeNode);
		treeNode = treeOperations.insertData(3, treeNode);
		treeNode = treeOperations.insertData(7, treeNode);
		treeNode = treeOperations.insertData(6, treeNode);
		treeNode = treeOperations.insertData(8, treeNode);

		//treeOperations.showInOrder(treeNode);
		//treeOperations.showPreOrder(treeNode);
		treeOperations.showPostOrder(treeNode);
	}

}
