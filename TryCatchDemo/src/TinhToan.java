import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhToan {
	int a;
	int b;
	
	public TinhToan() {
		
	}
	
	public int tinhChia() throws Exception {
		Scanner scanner = new Scanner(System.in);
		int c = 0;
	
		try {
			System.out.println("Nhap a: ");
			this.a = scanner.nextInt();
			if(a<0)
				throw new Exception("a phai > 0");
			
			System.out.println("Nhap b: ");
			this.b = scanner.nextInt();
					
			c = a/b;
		} catch(InputMismatchException e) {
			System.out.println("Nhap khong dung dinh dang!");
		} catch(ArithmeticException e) {
			System.out.println("b phai khac 0!");
		}
		System.out.println("Chuong trinh van dang chay");
		return c;
	}
	
	public int tinhNhan()  {
		Scanner scanner = new Scanner(System.in);
		int c = 0;
	
		try {
			System.out.println("Nhap a: ");
			this.a = scanner.nextInt();
			
			System.out.println("Nhap b: ");
			this.b = scanner.nextInt();
			if (b<0)
				throw new Exception("b phai > 0");
			
			c = a*b;
		} catch(InputMismatchException e) {
			System.out.println("Nhap khong dung dinh dang!");
		} catch(ArithmeticException e) {
			System.out.println("b phai khac 0!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Chuong trinh van dang chay");
		return c;
	}
}
