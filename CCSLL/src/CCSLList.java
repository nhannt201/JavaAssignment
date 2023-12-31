
public class CCSLList {
	Node head;
	Node tail;
	public CCSLList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		
		return false;
	}
	
	public void printList()
	{
		Node tmp = head;
		
		do
		{
			System.out.print(tmp.info + " ");
			
			tmp = tmp.next;
		}
		while (!tmp.equals(head));
		
		System.out.println("\n");
	}
	
	public void addTail(Object info)
	{
		Node q = new Node(info);
		if (isEmpty())
		{
			head = q;
			tail = head;
			tail.next = head;
		}
		else
		{
			tail.next = q;
			q.next = head;
			tail = q;
		}
	}
	
	public void addFirst(Object info)
	{
		Node  q = new Node(info);
		if (isEmpty())
		{
			head = q;
			tail = head;
			tail.next = head;
		}
		else
		{
			q.next = head;
			tail.next = q;
			head = q;
		}
	}
	
	public void addAfter(Object findValue, Object addValue)
	{
		if (tail.info.equals(findValue))
		{
			addTail(addValue);
			return;
		}
		
		Node tmp = head;
		do
		{
			if (tmp.info.equals(findValue))
			{
				Node q = new Node(addValue);
				q.next = tmp.next;
				tmp.next = q;
				
				return;
			}
			tmp = tmp.next;
		}
		while(!tmp.equals(head));
	}
	
	public void deleteHead() {
		head =head.next;
		tail.next = head;
	} 
	public void deleteTail() {
		Node tmp = head;
		while (!tmp.next.equals(tail)) {
			tmp =tmp.next;
		}
		
		tmp.next = head;
		tail = tmp;
	}
	
	public void deleteNode(Object xoagiatri) {
		if (head.info.equals(xoagiatri)) {
			deleteHead();
			return;
		}
		
		if (tail.info.equals(xoagiatri)) {
			deleteTail();
			return;
		}
		
		Node tmp = head;
		do
		{
			if (tmp.next.info.equals(xoagiatri))
			{
				Node q = tmp.next;
				tmp.next = q.next;
				
				return;
			}
			tmp = tmp.next;
			
		} while (!tmp.next.equals(head));
	}
	
	public boolean find (Object timgiatri) {
		Node tmp = head;
		
		do
		{
			if (tmp.info.equals(timgiatri))
				return true;
			
			tmp = tmp.next;
		} while (!tmp.equals(head));
		
		return false;
	}
}
