
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLLList s = new SLLList();
		System.out.println("Add tail");
		s.addTail(9);
		s.addTail(7);
		s.addTail(20);
		s.addTail(6);
		s.printList();
		
		System.out.println("Add First");
		s.addFirst(5);	
		s.printList();
			
		System.out.println("Add After");
		s.addAfter(9, 100);
		s.printList();
		
		s.addAfter(5, 300);
		s.printList();
		
		System.out.println("Delete Node");
		s.deleteNode(300);
		s.deleteNode(100);
		s.printList();
		
		//System.out.println(s.find(5));
	
	}

}
