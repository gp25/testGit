package FarEye;

import java.util.*;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> curr = queue.poll();
			System.out.println("Enter left child of : " + curr.data);
			int leftData = s.nextInt();
			if (leftData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
				curr.left = leftChild;
				queue.add(leftChild);
			}
			System.out.println("Enter right child of : " + curr.data);
			int rightData = s.nextInt();
			if (rightData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
				curr.right = rightChild;
				queue.add(rightChild);
			}
		}
		return root;
	}

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = "";
		toBePrinted += root.data + " : ";
		if (root.left != null) {
			toBePrinted += root.left.data + " , ";
		}
		if (root.right != null) {
			toBePrinted += root.right.data;
		}
		System.out.println(toBePrinted);
		printBinaryTree(root.left);
		printBinaryTree(root.right);
	}

	// LCA(Lowest Common Ancestor ) of b tree
	public static BinaryTreeNode<Integer> LCAOfBinaryTree(BinaryTreeNode<Integer> root, int n1, int n2) {
		if (root == null) {
			return null;
		}
		if (root.data == n1 || root.data == n2) {
			return root;
		}
		BinaryTreeNode<Integer> leftLCA = LCAOfBinaryTree(root.left, n1, n2);
		BinaryTreeNode<Integer> rightLCA = LCAOfBinaryTree(root.right, n1, n2);

		if (leftLCA != null && rightLCA != null) {
			return root;
		}
		return leftLCA != null ? leftLCA : rightLCA;
	}

	public static BinaryTreeNode<Integer> lcaOfBinaryTreePrac(BinaryTreeNode<Integer> root, int n1, int n2) {
		if (root == null) {
			return null;
		}
		if (root.data == n1 || root.data == n2) {
			return root;
		}
		BinaryTreeNode<Integer> leftlca = lcaOfBinaryTreePrac(root.left, n1, n2);
		BinaryTreeNode<Integer> rightlca = lcaOfBinaryTreePrac(root.right, n1, n2);
		if (leftlca != null && rightlca != null) {
			return root;
		}
		return leftlca != null ? leftlca : rightlca;
	}

	// LCA of Binary Search Tree
	// TC : O(h).....SC : O(1)
	public static int lcaOfBinarySearchTree(BinaryTreeNode<Integer> root, int n1, int n2) {
		if (root == null) {
			return -1;
		}
		if (root.data >= n1 && root.data <= n2) {
			return root.data;
		}
		if (n1 < root.data && n2 < root.data) {
			return lcaOfBinarySearchTree(root.left, n1, n2);
		}
		return lcaOfBinarySearchTree(root.right, n1, n2);
	}

	// This is from Leetcode solution
	public static int lcaOfBST(BinaryTreeNode<Integer> root, int n1, int n2) {
		if (root.data > n1 && root.data > n2) {
			return lcaOfBST(root.left, n1, n2);
		} else {
			if (root.data < n1 && root.data < n2) {
				return lcaOfBST(root.right, n1, n2);
			} else {
				return root.data;
			}
		}
	}

	public static int lcaBSTPrac(BinaryTreeNode<Integer> root, int n1, int n2) {
		if (root.data > n1 && root.data > n2) {
			return lcaBSTPrac(root.left, n1, n2);
		} else {
			if (root.data < n1 && root.data < n2) {
				return lcaBSTPrac(root.right, n1, n2);
			} else {
				return root.data;
			}
		}
	}

	// Maximum of Binary Tree
	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	// Minimum Of Binary tree
	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}

	// Check if given b tree is BST or not.
	public static boolean checkBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int maxLeft = maximum(root.left);
		System.out.println("Maximum Left : " + maxLeft);
		int minRight = minimum(root.right);
		System.out.println("Maximum Right : " + minRight);
		if (maxLeft < root.data && minRight >= root.data) {
			return checkBST(root.left) && checkBST(root.right);
		}
		return false;
	}

	// Optimized method of check BST
	public static boolean checkBSTOptimized(BinaryTreeNode<Integer> root) {
		return checkBSTOptimized(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean checkBSTOptimized(BinaryTreeNode<Integer> root, long minval, long maxval) {
		if (root == null) {
			return true;
		}
		if (root.data >= maxval || root.data <= minval) {
			return false;
		}
		return checkBSTOptimized(root.left, minval, root.data) && checkBSTOptimized(root.right, root.data, maxval);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		BinaryTreeNode<Integer> root = takeInput();
		printBinaryTree(root);

//		System.out.println("Enter value of n1 : ");
//		int n1 = s.nextInt();
//		System.out.println("Enter value of n2 : ");
//		int n2 = s.nextInt();
//		BinaryTreeNode<Integer> lca = LCAOfBinaryTree(root, n1, n2);
//		System.out.println("Lowest Common Ancestor of Binary Tree : " + lca.data);

//		System.out.println("Lowest Common Ancestor of BST : " + lcaOfBinarySearchTree(root, n1, n2));
//		System.out.println("LCA of BST : " + lcaOfBST(root, n1, n2));

//		System.out.println("check BST : " + checkBST(root));
		System.out.println("check BST Optimized : " + checkBSTOptimized(root));

	}

}
