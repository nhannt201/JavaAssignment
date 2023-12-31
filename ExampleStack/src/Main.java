
public class Main {

	public static void main(String[] args) {
		Stack goods = new Stack();

		goods.push("Omachi");
		goods.push("Aquafina");
		goods.push("Vinamilk");
		goods.push("Tiger Beer");
		goods.push("Kokomi");
		goods.push("Koreno");
		
		while(!goods.isEmpty()) {
			System.out.println( "Imported: " + goods.pop());
		}
		
	}

}
