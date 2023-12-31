import java.util.EmptyStackException;

public class Queue {
	protected Object[] a;
	protected int max;
	protected int first, last;
	public Queue(int max) {
		this.max = max;
		a = new Object[max];
		first = last = -1;
	}
	public Queue() {
		this(10);
	}
	public boolean isEmpty() {
		return (first==-1);
	}
	public boolean isFull() {
		return ((first == 0 && last == max -1) || (first ==last +1));
	}
	
	private boolean grow() {
		int i,j;
		int max1 = max + max /2;
		Object[] a1 = new Object[max];
		if (a1==null) return false;
		if (first<=last) {
			for (i=first; i <= last; i++) a1[i - first] = a[i];
		} else {
			for (i = first; i < max; i++) a1[i - first] = a[i];
			for (j = 0; j <= last; j++) a1[j + max - first] = a[j];
		}
		a = a1;
		max = max1;
		
		int size;
		if (first <= last) {
			size = last - first + 1;
			
		} else {
			size = max - first + last;
		}
		first = 0;
		last = size -1 ;
		return true;
	}
	
	public void enqueue(Object x) {
		if (isFull() && !grow()) {
			return;
		}
		if (last==max-1 || last == -1) {
			a[0] = x;
			last = 0;
			if (first == -1) {
				first = 0;
			}
		} else {
			a[++last] = x;
		}
	}
	
	public Object front() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException();
		return a[first];
	}
	public Object dequeue() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException();
		Object x = a[first];
		if (first==last) {
			first = last = -1;
		} else if (first == max -1) {
			first = 0;
		} else {
			first++;
		}
		return x;
	}
}
