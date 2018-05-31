//어떤 수 x가 소수인지 아닌지 판별하는 알고리즘
import java.util.Scanner;

public class A_0523 {
	public boolean isPrime(int n) {
		
		//1은 소수가 아님
		if(n <= 1) 
			return false;
		
		//짝수는 소수 아님
		if(n % 2 == 0 || n == 2) 
			return false;
		
		//i=3 ~ 루트n까지의 홀수
		for(int i =3; i*i <= n; i++) {
			if(n%i ==0) { //i가 n의 약수면 소수 아님
				return false;
			}
		}
		//나머지는 소수다!
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A_0523 MTest = new A_0523();

		Scanner sc = new Scanner(System.in);
		System.out.print("input: ");
		int a = sc.nextInt();
				
		if(MTest.isPrime(a) == false) {
			System.out.println("소수아니에옹");
		}
		else {
			System.out.println("소수에옹~!");
		}
	}
}
