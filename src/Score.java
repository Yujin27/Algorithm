import java.util.Scanner;

public class Score{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//��������Է�
		for(int i =0; i<a.length;i++) {
			System.out.println(i+1+"��° ��� ���� �Է�: ");
			a[i] = sc.nextInt();
		}		
		
		//����������
		for(int j =0; j<a.length;j++) {
		System.out.print(a[j] + "�� / ");
		}
		System.out.println( );

		//�ְ�,������ �ʱⰪ�� a[0]
		int max = a[0];
		int min = a[0];
		
		//���� ū ������ ���� ���� ���� ���
		for(int k =1; k<a.length;k++) {
			if(a[k] > max) 	
				max = a[k];
			if(a[k] < min) 
				min = a[k];
		}
		System.out.println("�ְ���: " + max + " / " + "������: " + min);
		
		//�հ������Һ���
		int sum =0;
		
		//�ְ�������������
		
		for(int m =0;m<a.length;m++) {
			sum = sum + a[m];
			if(a[m] == max) sum = sum - max;
			if(a[m] == min) sum = sum - min;
		}
		System.out.println("�ְ�,������ ���� ��: "+sum + "��");
		
		//��������Һ���
		int avg =0;
		
		//�������
		for(int b=0; b<a.length;b++) {
			avg = avg + a[b];
		}
		System.out.println("����� " + avg / a.length + "��");
	}
}