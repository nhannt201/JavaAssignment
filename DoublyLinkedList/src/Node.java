
public class Node {
	public Object info;
	public Node next;
	public Node pre;
	
	public Node() {}

	public Node(Object info, Node next, Node pre) {
		this.info = info;
		this.next = next;
		this.pre = pre;
	}

	public Node(Object info) {
		this.info = info;
		this.next = null;
		this.pre = null;
	}	
	
}
