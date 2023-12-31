import java.util.Scanner;
public class Main {
	public static Queue Queue = new Queue();
	public static Stack Stack = new Stack();
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean noerror =  true;
		do {
			try {
			System.out.print("Menu:\n1. Input message\n"
					+ "2. Send message\n"
					+ "3. Received message/View message\n"
					+ "4. Exit\n\n"
					+ "Enter choose: ");
			Integer choose = scanner.nextInt();
				switch(choose) {
				case 1:
					InputMes();
					break;
				case 2:		
					SendMes();
					break;
				case 3:
					ViewMes();
					break;
				case 4:
					System.out.println("Exited program!");
					noerror = false;
					break;
				default:
					System.out.println("The choose should be the numbers 1 through 4,"
							+ " please re-enter!");
					break;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Input must be a number!!");
				scanner.nextLine();
			}
		} while (noerror);		
	}
	
	
	
	public static void  InputMes() {
		System.out.print("Input message: ");
		scanner = new Scanner(System.in);
		String input_ms = scanner.nextLine();
		if (input_ms.length() < 250) {
			Queue.enqueue(input_ms);
			System.out.println("Input entered!\n");
		} else {
			System.out.println("Input must be less than 250 characters!\n");
		}
	}
	public static void  SendMes() {
		try {
			do {
				Stack.push(Queue.dequeue());
				System.out.println("Sent message!");
			} while(!Queue.isEmpty());
		} catch (java.util.EmptyStackException e ) {
			System.out.println("There was no message to send!");
		}
		
		
	}
	public static void  ViewMes() {
		System.out.println("View message:\n");
		try {
			do {
				System.out.println(Stack.pop() + " ");	
			} while(!Stack.isEmpty());
		} catch (java.util.EmptyStackException e ) {
			System.out.println("There was no message to view!");
		}
	
		
	}

}
