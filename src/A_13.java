import java.util.Scanner;

public class A_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1;
		int b =1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번째까지 구할래? ---> ");
		int n = sc.nextInt();
		
		int t =2;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(t);
		
		for(int h=a+b; h <= n; h++) {
		
			h = a+b;
			t = t+h;
			a=b;
			b=h;
			
			System.out.println(t);	
		}
	}
}
