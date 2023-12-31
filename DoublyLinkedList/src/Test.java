
public class Test {

	public static void main(String[] args) {
		DLLList ds2chieu = new DLLList();
		System.out.println("Add First");
		ds2chieu.addFirst(10);
		ds2chieu.addFirst(11);
		ds2chieu.addFirst(12);
		ds2chieu.addFirst(13);
		ds2chieu.addFirst(14);
		ds2chieu.addFirst(15);

		ds2chieu.printList();
		
		System.out.println("Add Tail");
		ds2chieu.addTail(20);
		ds2chieu.printList();
		
		System.out.println("Add After");
		ds2chieu.addAfter(12, 29);
		ds2chieu.printList();
		
		System.out.println("Delete Head & Tail");
		ds2chieu.deleteHead();
		ds2chieu.deleteTail();	
		ds2chieu.printList();

		System.out.println("Delete a Node");
		ds2chieu.deleteNode(29);
		ds2chieu.printList();
	}

}
