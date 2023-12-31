import java.util.Scanner;

public class Main {
	public static Queue inputQ = new Queue();
	public static Stack inputS = new Stack();
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		createMenu();
	}
	
	public static void createMenu() {
		System.out.print("------------------------------------------\nMenu:\n1. Input message\n2. Send message\n3. Received message/ View message\n4. Exit\n\nEnter choose: ");
		try {
			Integer choose = scanner.nextInt();
			switch(choose) {
			case 1:
				Case1();
				break;
			case 2:		
				Case2();
				break;
			case 3:
				Case3();
				break;
			case 4:
				System.out.println("Exited program!");
				System.exit(0);
				break;
			default:
				System.out.println("The choose should be the numbers 1 through 4, please re-enter!");
				createMenu();
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid choose, please re-enter!");
			createMenu();
		}
		
	}
	
	public static void  Case1() {
		System.out.print("Input message: ");
		scanner = new Scanner(System.in);
		String input_ms = scanner.nextLine();
		if (input_ms.length() < 250) {
			inputQ.enqueue(input_ms);
			System.out.println("Input entered!\n");
			createMenu();
		} else {
			System.out.println("Input must be less than 250 characters!\n");
			createMenu();
		}
	}
	public static void  Case2() {
		try {
			while(!inputQ.isEmpty()) {
				inputS.push(inputQ.dequeue());
			}
			System.out.println("Sent message!");
			createMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void  Case3() {
		System.out.println("View message:\n");
		while(!inputS.isEmpty()) {
			System.out.println(inputS.pop() + " ");
		}
		System.out.println("\n");
		createMenu();
	}

}
