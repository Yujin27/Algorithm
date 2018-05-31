//1, 2의 보수
import java.util.Scanner;
public class Complement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력값
		int [] a = new int[4];
		//1의 보수값
		int [] com1 = new int[4];
		//2의 보수값
		int [] com2 = new int[4];
		//올림수가 있는지 아닌지 파악 하는 변수
		//1=올림o, 0=올림x
		int up = 1;
		
		Scanner sc = new Scanner(System.in);
		//수입력
		for(int i =0; i<a.length;i++) {
			System.out.print("input: ");
			a[i] = sc.nextInt();
		}
		System.out.println("입력한 2진수는 " + a[0] + a[1] + a[2] + a[3]);
		
		//1의보수
		for(int j = 0; j<a.length; j++) {
			com1[j] = 1 - a[j];
		}
		System.out.println("1의 보수는 " + com1[0] + com1[1] + com1[2] + com1[3]);
		
		//2의보수
		//1의 보수 +1
		//마지막 숫자가 0일 경우 
		if(com1[3] == 0) {
			com2[3] = 1;
			for(int m =2; m>=0;m--) {
				com2[m] = com1[m];				
			}
		}else if(com1[3] == 1) { //마지막 숫자가 1일 경우
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
		System.out.println("2의 보수는 " + com2[0] + com2[1]  + com2[2] + com2[3]);
	}
}