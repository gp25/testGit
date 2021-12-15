package PharmEasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {

	static Node root;

	static class Node {

		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void inorder() {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while (temp != null || stack.size() > 0) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.left;
			}
			temp = stack.pop();
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}
	
	public static void findIndexOftargetSum(int arr[],int target) {
		int n=arr.length;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(target-arr[i])) {
				System.out.println(map.get(target-arr[i])+" "+i);
				return;
			}else {
				if(!map.containsKey(arr[i])) {
					map.put(arr[i], i);
				}
			}
		}
	}
	
	public static void parentheses(int n,String[] s) {
		if(n<=0) {
			return;
		}
		parenthesesRec(n,s,0,0);
	}

	private static void parenthesesRec(int n, String[] s, int i, int j) {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test t = new Test();
//		Node n1 = new Node(10);
//		Node n2 = new Node(20);
//		Node n3 = new Node(30);
//		Node n4 = new Node(40);
//		Node n5 = new Node(50);

//		t.root = n1;
//		n1.left = n2;
//		n1.right = n3;
//		n2.left = n4;
//		n2.right = n5;

//		System.out.println("Inorder Traversal : ");
//		inorder();
		
		int arr[]= {2,7,11,15};
		findIndexOftargetSum(arr, 26);

	}

}
