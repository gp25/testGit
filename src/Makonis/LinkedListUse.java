package Makonis;

public class LinkedListUse {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// reverse linked list
	public static Node reverseLLRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newNode = reverseLLRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newNode;
	}

//	public static Node reverseLLRecursivePrac(Node head) {
//		if()
//	}

	public static void printLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedListUse ll = new LinkedListUse();

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);

		ll.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		printLL(n1);

		Node rev = reverseLLRecursive(n1);
		printLL(rev);

	}

}
