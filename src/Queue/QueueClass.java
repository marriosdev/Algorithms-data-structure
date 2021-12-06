package Queue;

public class QueueClass {

	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node head; //remove here
	private Node tail; //add here
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek() { //get the first added element
		return head.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}
	
	public int remove() {
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}
	
}
