//1, 2�� ����
import java.util.Scanner;
public class Complement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Է°�
		int [] a = new int[4];
		//1�� ������
		int [] com1 = new int[4];
		//2�� ������
		int [] com2 = new int[4];
		//�ø����� �ִ��� �ƴ��� �ľ� �ϴ� ����
		//1=�ø�o, 0=�ø�x
		int up = 1;
		
		Scanner sc = new Scanner(System.in);
		//���Է�
		for(int i =0; i<a.length;i++) {
			System.out.print("input: ");
			a[i] = sc.nextInt();
		}
		System.out.println("�Է��� 2������ " + a[0] + a[1] + a[2] + a[3]);
		
		//1�Ǻ���
		for(int j = 0; j<a.length; j++) {
			com1[j] = 1 - a[j];
		}
		System.out.println("1�� ������ " + com1[0] + com1[1] + com1[2] + com1[3]);
		
		//2�Ǻ���
		//1�� ���� +1
		//������ ���ڰ� 0�� ��� 
		if(com1[3] == 0) {
			com2[3] = 1;
			for(int m =2; m>=0;m--) {
				com2[m] = com1[m];				
			}
		}else if(com1[3] == 1) { //������ ���ڰ� 1�� ���
			for(int m = 3; m >=0; m--) {
				if(up == 1) {
					if(com1[m]+up == 2) {
						com2[m] = 0;
						up = 1;
					}else if(com1[m]+up == 1) {
						com2[m]= 1;
						up = 0;
					}
				}else {
					com2[m] = com1[m];
				}
			}
		}
		System.out.println("2�� ������ " + com2[0] + com2[1]  + com2[2] + com2[3]);
	}
}