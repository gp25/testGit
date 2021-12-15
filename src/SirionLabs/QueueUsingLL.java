package SirionLabs;

public class QueueUsingLL<T> {

	private LLNode<T> front;
	private LLNode<T> rear;
	private int size;

	public QueueUsingLL() {
		this.front = this.rear = null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T front() {
		if (front == null) {
			return null;
		}
		return front.data;
	}

	public void enqueue(T element) {
		LLNode<T> newNode = new LLNode<T>(element);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public T dequeue() {
		if (front == null) {
			return null;
		}
		T temp = front.data;
		if (front.next == null) {
			front = rear = null;
		} else {
			front = front.next;
		}
		size--;
		return temp;
	}

}
