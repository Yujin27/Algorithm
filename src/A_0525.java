//1ÀÇº¸¼ö
import java.util.Scanner;

public class A_0525 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[4];
		int [] b = new int[4];
		Scanner sc = new Scanner(System.in);
	
		for(int i =0; i<a.length;i++) {
			System.out.println("input: ");
			a[i] = sc.nextInt();
		}
		
		for(int j = 0; j<a.length; j++) {
			b[j] = 1 - a[j];
			System.out.print(b[j]);
		}
	}
		
}
