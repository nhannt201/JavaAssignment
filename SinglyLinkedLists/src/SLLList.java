
public class SLLList {
	Node head;
	Node tail;
	
	public SLLList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		if (head == null) 
			return true;
		
		return false;
	}
	
	public void addTail(Object info) {
		Node q = new Node(info);
		if (isEmpty()) {
			head = q;
			tail = q;
		} else {
			tail.next = q;
			tail = q;
		}
	}
	
	public void addFirst(Object info) {
		Node q = new Node(info);
		if (isEmpty()) {
			head = q;
			tail = q;
		} else {
			q.next = head;
			head = q;
		}
	}
	
	public void addAfter(Object findValue, Object addValue ) {
		

		//Ngoai le 1
		if (tail.info.equals(findValue))
		{
			addTail(addValue);
			return;
		}
		
		
		//if (find(findValue) == null) { //tim co ton tai chua
		//	System.out.println("Gia tri khong ton tai, khong the addAfter!");
		//} else {
		//Ngoai le 2
			Node tmp = head;
			while(tmp!=null&& !tmp.info.equals(findValue)) {	
					tmp = tmp.next;
			}
			
			if(tmp !=null)
			{
				Node q = new Node(addValue);
				q.next = tmp.next;
				tmp.next = q;
			}
			
			
		//}
	}
	
	public void deleteHead() {
		head = head.next;
	}
	
	public void deleteTail() {
		Node tmp = head;
		
		while(!tmp.next.equals(tail)) {
			tmp =tmp.next;
		}
		
		tmp.next = null;
		tail = tmp;
	}
	
	public void deleteNode(Object xoagiatri) {
		Node tmp = head;
		
		while(!tmp.next.info.equals(xoagiatri)) {
			tmp =tmp.next;
		}
		
		Node q = tmp.next;
		tmp.next = q.next;
	}
	
	public Object find(Object timgiatri) {
		Node tmp = head;
		//Object num = null;
		/**for (tmp = head; tmp!=null; tmp = tmp.next) {
			if (tmp.info.equals(timgiatri))
				num = tmp.info;
		}**/
		while(tmp!=null&& tmp.next.info.equals(timgiatri)) {
			tmp  = tmp.next;
		}
		if (tmp != null)
			return true;
					
		return false;
	}
	
	public void printList() {
		Node tmp = head;
		for (tmp = head; tmp!=null; tmp = tmp.next) {
			System.out.print(tmp.info + " ");
		}
		System.out.println("\n");
	}
	
	
}
