package FarEye;

import java.util.*;

public class LinkedListUse {

	public static NodeLLFarEye<Integer> takeInputLL() {
		Scanner s = new Scanner(System.in);
		NodeLLFarEye<Integer> head = null;
		NodeLLFarEye<Integer> tail = null;
		System.out.println("Enter node data : ");
		int data = s.nextInt();
		while (data != -1) {
			NodeLLFarEye<Integer> temp = new NodeLLFarEye<Integer>(data);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				tail.next = temp;
				tail = tail.next;
			}
			System.out.println("Enter node data : ");
			data = s.nextInt();
		}
		return head;
	}

	public static void printLL(NodeLLFarEye<Integer> head) {
		System.out.println("Linked List : ");
		NodeLLFarEye<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Find nth element from last in a linklist
	public static NodeLLFarEye<Integer> nthELementFromLast(NodeLLFarEye<Integer> head, int n) {
		if (head == null) {
			return null;
		}
		NodeLLFarEye<Integer> start = new NodeLLFarEye<Integer>(null);
		start.next = head;
		NodeLLFarEye<Integer> slow = start;
		NodeLLFarEye<Integer> fast = start;
		int count = 0;
		while (count < n) {
			fast = fast.next;
			count++;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.next;
	}

	// Find nth element from last in a linklist
	public static int nthELementFromLastPrac(NodeLLFarEye<Integer> head, int n) {
		if (head == null) {
			return 0;
		}
		NodeLLFarEye<Integer> start = new NodeLLFarEye<Integer>(null);
		start.next = head;
		NodeLLFarEye<Integer> slow = start;
		NodeLLFarEye<Integer> fast = start;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.next.data;
	}

	// Write an algoithm to reverse a linked list.
	public static NodeLLFarEye<Integer> reverseLinkedList(NodeLLFarEye<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		NodeLLFarEye<Integer> newNode = reverseLinkedList(head.next);
		head.next.next = head;
		head.next = null;
		return newNode;
	}

	public static NodeLLFarEye<Integer> reverseLLPrac(NodeLLFarEye<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		NodeLLFarEye<Integer> newNode = reverseLLPrac(head.next);
		head.next.next = head;
		head.next = null;
		return newNode;
	}

	public static NodeLLFarEye<Integer> reverseIterativePrac(NodeLLFarEye<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		NodeLLFarEye<Integer> prev = null;
		NodeLLFarEye<Integer> curr = head;
		NodeLLFarEye<Integer> next = curr.next;
		while (next != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
		}
		curr.next = prev;
		head = curr;
		return head;
	}

	// swapping nodes of linked list
	public static NodeLLFarEye<Integer> swapNodesOfLL(NodeLLFarEye<Integer> head, int x, int y) {
		if (x == y) {
			return head;
		}
		NodeLLFarEye<Integer> prevx = null;
		NodeLLFarEye<Integer> currx = head;
		while (currx != null && currx.data != x) {
			prevx = currx;
			currx = currx.next;
		}
		NodeLLFarEye<Integer> prevy = null;
		NodeLLFarEye<Integer> curry = head;
		while (curry != null && curry.data != y) {
			prevy = curry;
			curry = curry.next;
		}

		if (currx == null || curry == null) {
			return head;
		}

		if (prevx != null) {
			prevx.next = curry;
		} else {
			head = curry;
		}

		if (prevy != null) {
			prevy.next = currx;
		} else {
			head = currx;
		}

		NodeLLFarEye<Integer> temp = currx.next;
		currx.next = curry.next;
		curry.next = temp;
		return head;

	}

	// swapping nodes of linked list Practice
	public static NodeLLFarEye<Integer> swapNodesOfLLPrac(NodeLLFarEye<Integer> head, int x, int y) {
		if (head == null || head.next == null) {
			return head;
		}
		if (x == y) {
			return head;
		}
		NodeLLFarEye<Integer> prevx = null;
		NodeLLFarEye<Integer> currx = head;
		while (currx != null && currx.data != x) {
			prevx = currx;
			currx = currx.next;
		}
		NodeLLFarEye<Integer> prevy = null;
		NodeLLFarEye<Integer> curry = head;
		while (curry != null && curry.data != y) {
			prevy = curry;
			curry = curry.next;
		}
		if (currx == null || curry == null) {
			return head;
		}
		if (prevx != null) {
			prevx.next = curry;
		} else {
			head = curry;
		}
		if (prevy != null) {
			prevy.next = currx;
		} else {
			head = currx;
		}
		NodeLLFarEye<Integer> temp = currx.next;
		currx.next = curry.next;
		curry.next = temp;
		return head;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		NodeLLFarEye<Integer> head = takeInputLL();
		printLL(head);
		System.out.println();

//		System.out.println("Enter nth position : ");
//		int n = s.nextInt();
//		NodeLLFarEye<Integer> nthelement = nthELementFromLast(head, n);
//		System.out.println("N th element from last in a linklist : " + nthelement.data);
//		System.out.println("N th element from last in a linklist Prac : " + nthELementFromLastPrac(head, n));

//		System.out.println("Reverse Linked List : ");
//		NodeLLFarEye<Integer> rev = reverseLinkedList(head);
//		printLL(rev);

//		System.out.println("Reverse Linked List Iterative : ");
//		NodeLLFarEye<Integer> rev1 = reverseIterativePrac(head);
//		printLL(rev1);

		System.out.println("Enter value 1 : ");
		int x = s.nextInt();
		System.out.println("Enter value 2 : ");
		int y = s.nextInt();
//		NodeLLFarEye<Integer> newNode = swapNodesOfLL(head, x, y);
//		printLL(newNode);
		NodeLLFarEye<Integer> newNode = swapNodesOfLLPrac(head, x, y);
		printLL(newNode);
	}

}
