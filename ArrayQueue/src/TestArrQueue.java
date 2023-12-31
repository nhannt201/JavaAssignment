
public class TestArrQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayQueue a = new ArrayQueue();
		a.enqueue(15);
		a.enqueue(14);
		a.enqueue(13);
		a.enqueue(12);
		a.enqueue(11);
		
		while(!a.isEmpty()) {
			System.out.print(a.dequeue() + " ");
		}
		
		a.enqueue(10);
		System.out.println();
		while(!a.isEmpty()) {
			System.out.print(a.dequeue() + " ");
		}
	}

}
