
public class Node {
	Object info;
	Node next;
	static int getCount = 0;
	
	public Node() {
		getCount++;
	}

	public Node(Object info) {
		this.info = info;
		this.next = null;
		getCount++;
	}
	
	public Node(Object info, Node next) {
		this.info = info;
		this.next = next;
		getCount++;
	}
	
	
}
