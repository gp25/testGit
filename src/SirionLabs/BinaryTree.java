package SirionLabs;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class BinaryTree {

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = queue.dequeue();
			System.out.println("Enter left child of " + frontNode.data + " : ");
			int leftData = s.nextInt();
			if (leftData != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
				frontNode.left = leftChild;
				queue.enqueue(leftChild);
			}
			System.out.println("Enter right child of : " + frontNode.data + " : ");
			int rightData = s.nextInt();
			if (rightData != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
				frontNode.right = rightChild;
				queue.enqueue(rightChild);
			}
		}
		return root;
	}

	public static void print(BinaryTreeNode<Integer> root) {
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
		print(root.left);
		print(root.right);
	}

	// Top View of Binary Tree
	public static void topViewBinaryTree(BinaryTreeNode<Integer> root) {
		class QueueObj {
			BinaryTreeNode<Integer> root;
			int hd;

			public QueueObj(BinaryTreeNode<Integer> root, int hd) {
				this.root = root;
				this.hd = hd;
			}
		}
		Queue<QueueObj> queue = new LinkedList<QueueObj>();
		Map<Integer, BinaryTreeNode<Integer>> topView = new TreeMap<Integer, BinaryTreeNode<Integer>>();
		if (root == null) {
			return;
		} else {
			queue.add(new QueueObj(root, 0));
		}
		System.out.println("Top View of Binary Tree : ");
		while (!queue.isEmpty()) {
			QueueObj currNode = queue.poll();
			if (!topView.containsKey(currNode.hd)) {
				topView.put(currNode.hd, currNode.root);
			}
			if (currNode.root.left != null) {
				queue.add(new QueueObj(currNode.root.left, currNode.hd - 1));
			}
			if (currNode.root.right != null) {
				queue.add(new QueueObj(currNode.root.right, currNode.hd + 1));
			}
		}
		for (Map.Entry<Integer, BinaryTreeNode<Integer>> e : topView.entrySet()) {
			System.out.print(e.getValue().data + " ");
		}
		System.out.println();
	}

	public static void topviewprac(BinaryTreeNode<Integer> root) {
		class QueueObj {
			BinaryTreeNode<Integer> root;
			int hd;

			public QueueObj(BinaryTreeNode<Integer> root, int hd) {
				this.root = root;
				this.hd = hd;
			}
		}
		Queue<QueueObj> queue = new LinkedList<QueueObj>();
		Map<Integer, BinaryTreeNode<Integer>> topView = new TreeMap<Integer, BinaryTreeNode<Integer>>();
		System.out.println("Top View : ");
		if (root == null) {
			return;
		} else {
			queue.add(new QueueObj(root, 0));
		}
		while (!queue.isEmpty()) {
			QueueObj currNode = queue.poll();
			if (!topView.containsKey(currNode.hd)) {
				topView.put(currNode.hd, currNode.root);
			}
			if (currNode.root.left != null) {
				queue.add(new QueueObj(currNode.root.left, currNode.hd - 1));
			}
			if (currNode.root.right != null) {
				queue.add(new QueueObj(currNode.root.right, currNode.hd + 1));
			}
		}
		for (Map.Entry<Integer, BinaryTreeNode<Integer>> m : topView.entrySet()) {
			System.out.print(m.getValue().data + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		print(root);

		System.out.println("Top View Of Binary Tree : ");
//		topViewBinaryTree(root);

		topviewprac(root);

	}

}
