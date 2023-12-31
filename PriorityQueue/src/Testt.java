import java.util.PriorityQueue;
import java.util.Queue;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<KH> q = new PriorityQueue<>();
		
		KH k1 = new KH("Nguyen A", 3);
		KH k2 = new KH("Nguyen B", 2);
		KH k3 = new KH("Nguyen C", 1);
		KH k4 = new KH("Nguyen D", 2);
		KH k5 = new KH("Nguyen E", 1);
		
		q.add(k1);
		q.add(k2);
		q.add(k3);
		q.add(k4);
		q.add(k5);
		
		while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
	}

}
