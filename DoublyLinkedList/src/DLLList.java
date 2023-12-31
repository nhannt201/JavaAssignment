
public class DLLList {
	Node head;
	Node tail;
	
	public DLLList() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		if (head==null)
			return true;
		
		return false;
	}
	
	public void printList()
	{
		for(Node tmp = head;tmp!=null;tmp=tmp.next)
		{
			System.out.print(tmp.info + " ");
		}
		
		System.out.print("\n");
	}
	
	public void addFirst(Object info)
	{
		Node q = new Node(info);
		if(isEmpty())
		{
			head = q;
			tail = q;
		}
		else
		{
			q.next = head;
			head.pre = q;
			head = q;
		}
	}
	public void addTail(Object info)
	{
		Node q = new Node(info);
		if(isEmpty())
		{
			head = q;
			tail = q;
		}
		else
		{
			tail.next = q;
			q.pre = tail;
			tail = q;
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
		while(tmp!=null && !tmp.info.equals(findValue))
		{
			tmp =tmp.next;
		}
		
		if (tmp!=null)
		{
			Node q = new Node(addValue);
			
			q.next = tmp.next;
			q.pre = tmp;
			
			tmp.next.pre = q;
			tmp.next = q;
		}	
	}
	
	public void deleteHead()
	{
		head = head.next;
		head.pre = null;
	}
	
	public void deleteTail()
	{
		tail = tail.pre;
		tail.next = null;
	}
	
	public void deleteNode(Object xoagiatri)
	{
		if (head.info.equals(xoagiatri))
		{
			deleteHead();
			return;
		}
		if (tail.info.equals(xoagiatri))
		{
			deleteTail();
			return;
		}
		Node tmp = head;
		while(tmp!=null && !tmp.info.equals(xoagiatri))
		{
			tmp =tmp.next;
		}
		
		
		if(tmp!=null)
		{
			tmp.pre.next = tmp.next;
			tmp.next.pre = tmp.pre;
		}
	}
}
