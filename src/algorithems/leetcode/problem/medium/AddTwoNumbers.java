package algorithems.leetcode.problem.medium;

import java.math.BigInteger;

import algorithems.linkedlist.LinkedList;
import algorithems.linkedlist.Node;

public class AddTwoNumbers {

	public static Node sumNode;
	
	public static BigInteger getNodeDataClubed(Node n) {
		
		/*long listval = 0;
		
		while(n.getNext() != null) {
			listval = (listval * 10) + n.getData();
			n = n.getNext();
		}
		
		listval = (listval * 10) + n.getData();
		
		return listval;*/
		
		String listVal = "";
		
		while(n.getNext() != null) {
			listVal = listVal + n.getData();
			n = n.getNext();
		}
		
		listVal = listVal + n.getData();
		
		System.out.println("string.listVal: "+listVal);
		StringBuilder listValue = new StringBuilder(listVal);
		
		return new BigInteger(listValue.reverse().toString());
	}
	
	/*public static long reverseInteger(long val) {
		
		long digit = 0, reverse = 0;
		
		while(val != 0) {
			
			digit = val % 10;		
			reverse = (reverse *  10) + digit;
			val = val/10;		
		}
		
		return reverse;
	}*/
	
	public static void setNodeData(long digit) {
		
		int val = (int) digit;
		
		if(sumNode == null) {		
			sumNode = new Node(val);
			
		}else {			
			Node n = sumNode;
			
			while(n.getNext() != null) {
				n = n.getNext();		
			}
			
			n.setNext(new Node(val));
		}	
	}
	
	public static Node addTwoNumbersProcess(Node l1, Node l2) {
		
		BigInteger listVal1, listVal2, sum, val;
		long digit = 0;
		
	/*	if (l1 == null && l2 == null) {
			return null;
		}
		
		if(l1 == null || l2 == null) {
			
			if(l1 == null) {
				return l2;
			}else {
				return l1;
			}
			
		}*/
		
		listVal1 = getNodeDataClubed(l1);
		listVal2 = getNodeDataClubed(l2);
		
		//System.out.println("before reverse...\n");
		
		System.out.println("listval1: "+listVal1);
		System.out.println("listval2: "+listVal2);
		
		
		//System.out.println("after reverse...\n");
		
		//System.out.println("listval1: "+reverseInteger(listVal1));
		//System.out.println("listval2: "+reverseInteger(listVal2));
		
		//sum = reverseInteger(listVal1) + reverseInteger(listVal2);
		
		sum = listVal1.add(listVal2);
		
		System.out.println("sum: "+sum);
		val = sum;
		//val = reverseInteger(sum);
		System.out.println("val: "+val);
		
		while(val.signum() != 0) {
			
			digit = val.mod(new BigInteger("10")).longValue();
			val = val.divide(new BigInteger("10"));
			//digit = val % 10;		
			//val = val/10;
			
			//System.out.println("sumDigit: "+digit);
			//sumList.insert(digit);
			
			setNodeData(digit);
			
			/*if(sumNode == null) {
				sumNode = new Node(digit);
			}else {
				
				while(sumNode.getNext() != null) {
					sumNode = sumNode.getNext();
				}
				
				sumNode.setNext(new Node(digit));
			}*/
			
		}
		
		System.out.println("sumNodeData.object: "+sumNode);
		
		return sumNode;
    }
	
	public static void main(String[] args) {
		
		Node listNode1 = new Node();
		Node listNode2 = new Node();
		Node sumNode = null;
		
		LinkedList linkedList1 = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		
		//[9]
		//[1,9,9,9,9,9,9,9,9,9]

		//expected : [0,0,0,0,0,0,0,0,0,0,1]

		
		//linkedList1.insert(0);
		//linkedList1.insert(2);
		//linkedList1.insert(4);
		//linkedList1.insert(3);
		
		/*linkedList1.insert(9);
		linkedList1.insert(9);
		linkedList1.insert(9);
		linkedList1.insert(9);
		linkedList1.insert(9);
		linkedList1.insert(9);
		linkedList1.insert(9);
		*/
		
		// 3rd test
		//linkedList1.insert(9);

		
		//listNode1 = linkedList1.getHead();
		
		// node 2 value inserting...
		
		//linkedList2.insert(0);
		//linkedList2.insert(5);
		//linkedList2.insert(6);
		//linkedList2.insert(4);
		
		
		/*linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		*/
		
		// 3rd test
		/*linkedList2.insert(1);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(9);*/
		
		// 4th testcase.........
		
		//input: [0,8,6,5,6,8,3,5,7]
		//		[6,7,8,0,8,5,8,9,7]
		
		//O/P : [6,5,5,6,4,4,2,5,5,1]
		
		linkedList1.insert(0);
		linkedList1.insert(8);
		linkedList1.insert(6);
		linkedList1.insert(5);
		linkedList1.insert(6);
		linkedList1.insert(8);
		linkedList1.insert(3);
		linkedList1.insert(5);
		linkedList1.insert(7);
		
		linkedList2.insert(6);
		linkedList2.insert(7);
		linkedList2.insert(8);
		linkedList2.insert(0);
		linkedList2.insert(8);
		linkedList2.insert(5);
		linkedList2.insert(8);
		linkedList2.insert(9);
		linkedList2.insert(7);
		
		
		// 5th testCase.....
		
		/*linkedList1.insert(1);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(1);
		
		
		linkedList2.insert(5);
		linkedList2.insert(6);
		linkedList2.insert(4);*/
		
		listNode1 = linkedList1.getHead();
		
		listNode2 = linkedList2.getHead();
		//Node traveseNode = listNode1;
		
		sumNode = addTwoNumbersProcess(listNode1, listNode2);
		
		if(sumNode == null) {
			sumNode = new Node(0);
		}
		
		while(sumNode.getNext() != null) {
			
			System.out.println("sumNodeData: "+sumNode.getData());
			sumNode = sumNode.getNext();	
		}

		System.out.println("sumNodeData: "+sumNode.getData());
	}

}

