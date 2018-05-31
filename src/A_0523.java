//� �� x�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �˰���
import java.util.Scanner;

public class A_0523 {
	public boolean isPrime(int n) {
		
		//1�� �Ҽ��� �ƴ�
		if(n <= 1) 
			return false;
		
		//¦���� �Ҽ� �ƴ�
		if(n % 2 == 0 || n == 2) 
			return false;
		
		//i=3 ~ ��Ʈn������ Ȧ��
		for(int i =3; i*i <= n; i++) {
			if(n%i ==0) { //i�� n�� ����� �Ҽ� �ƴ�
				return false;
			}
		}
		//�������� �Ҽ���!
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A_0523 MTest = new A_0523();

		Scanner sc = new Scanner(System.in);
		System.out.print("input: ");
		int a = sc.nextInt();
				
		if(MTest.isPrime(a) == false) {
			System.out.println("�Ҽ��ƴϿ���");
		}
		else {
			System.out.println("�Ҽ�����~!");
		}
	}
}
