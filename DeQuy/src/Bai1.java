
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = tongle(5);
		//System.out.println("KQ: " + num);
		//covertobin(10);	
		//int fibors = fibo(5);
		//System.out.println("KQ Fibo: " + fibors);
		nontail(5);
	}
	public static int gthua(int num){
		if (num==1)
			return 1;
		return gthua(num-1)*num;
	}
	public static int luythua(int n) {
		if (n==0)
			return 1;
		return luythua(n-1)*2;
	}
	public static int tongle(int n) {
		if (n==1)
			return 1;
		return  tongle(n-1)+n*2-1;
	}
	public static void covertobin(int n) {
		int nguyen = n/2;
		int du = n%2;
		if (nguyen > 0) {
			covertobin(nguyen);
		}
		System.out.println(du);
	}
	public static int fibo(int n) {
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
	public static void tail(int n)
	{
		if (n==0)
			return;
		
		System.out.println(n + " ");
		tail(n-1);
	}
	public static void nontail(int n)
	{
		if (n==0)
			return;
		nontail(n-1);
		System.out.println(n + " ");
	}
}
