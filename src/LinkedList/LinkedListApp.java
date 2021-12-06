package LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList l = new LinkedList(new Node(1));
		
		l.append(3);
		System.out.println(l.head.data);
		System.out.println(l.head.next.data);
		
	}
}
