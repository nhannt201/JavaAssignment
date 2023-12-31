import java.util.Stack;
public class Testt {

	public static void main(String[] args) {
		//ve tim them cac bai tap ve stack
		/**Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(1);
		
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}**/
		ArrayStack as = new ArrayStack();
		
		as.push(10);
		as.push(5);
		as.push(12);
		as.push(13);
		as.push(14);
		
		while(!as.isEmpty()) {
			System.out.println(as.pop() + " ");
		}
		
		int num = 16;
		
		/**while(num!=0) {
			int du = num%2;
			as.push(du);
			num = num/2;
		}**/
		while(!as.isEmpty()) {
			System.out.print(as.pop() + " ");
		}
		
		
		
	}

}
