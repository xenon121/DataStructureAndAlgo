package algorithems.leetcode.problem.medium;

public class RemoveNthNodeFromEndOfList {

	private static int maxLength = 0;
	private static int currentIndex = 0;
	static ListNode listNode;
	
	public static int detectAndDeleteNodeFromEnd(int deleteIndex, ListNode node) {
		
		int index = currentIndex;
		
		if(node.next != null) {
			currentIndex++;
			maxLength = detectAndDeleteNodeFromEnd(deleteIndex, node.next);
			
		}else {
			
			if((currentIndex + 1) == deleteIndex) {		
				listNode = listNode.next;	
			}	
			return currentIndex;
		}
		
		if((maxLength - index) == deleteIndex) {
			node.next = node.next.next;		
		}
		
		return maxLength;
	}
	
	public static void insert(int digit) {
		
		int val = digit;
		
		if(listNode == null) {		
			listNode = new ListNode(val);
			
		}else {			
			ListNode n = listNode;
			
			while(n.next != null) {
				n = n.next;		
			}		
			n.next = new ListNode(val);
		}	
	}
	
	public static void main(String[] args) {
		
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		
		ListNode processNode = listNode;
		
		detectAndDeleteNodeFromEnd(5, processNode);

		while(listNode.next != null) {
			
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
		System.out.println(listNode.val);
	}
	
}
