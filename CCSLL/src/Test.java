
public class Test {

	public static void main(String[] args) {
		CCSLList s = new CCSLList();
		System.out.println("Add Tail");
		s.addTail(9);
		s.addTail(7);
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
		
		System.out.println("Finded a string: "+s.find(5));
	}

}
