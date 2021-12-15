package Amazon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTreeUse {

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
			BinaryTreeNode<Integer> currentNode = queue.remove();
			System.out.println("Enter left chid of " + currentNode.data + " : ");
			int leftData = s.nextInt();
			if (leftData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
				queue.add(leftChild);
				currentNode.left = leftChild;
			}
			System.out.println("Enter right child of " + currentNode.data + " : ");
			int rightData = s.nextInt();
			if (rightData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
				queue.add(rightChild);
				currentNode.right = rightChild;
			}
		}
		return root;
	}

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + " : ";
		if (root.left != null) {
			toBePrinted += root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += root.right.data;
		}
		System.out.println(toBePrinted);
		printBinaryTree(root.left);
		printBinaryTree(root.right);
	}

	// Preorder Traversal
	public static void preorderTraversal(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	// Postorder Traversal
	public static void postorderTraversal(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data + " ");
	}

	// Inorder Traversal
	public static void inorderTraversal(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		BinaryTreeNode<Integer> root = takeInput();
		printBinaryTree(root);

		System.out.print("Preorder Traversal : ");
		preorderTraversal(root);
		System.out.println();

		System.out.print("Postorder Traversal : ");
		postorderTraversal(root);
		System.out.println();

		System.out.print("Inorder Traversal : ");
		inorderTraversal(root);
		System.out.println();

	}

}
