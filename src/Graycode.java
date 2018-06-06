import java.util.Scanner;
public class Graycode {
	public static int[] transe (int[] a){		
		for(int i =0; i<2;i++) {
			if(a[i] == a[i+1]) {
				a[i+1] = 0;
			}
			else {
				a[i+1] = 1;
			}
		}
		return a;
	}
	
	public static void print(int[] a) {
		for(int i =0; i <a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] binary = new int[4];
		int [] gray = new int[4];
		
		//2진수 입력
		for(int i=0; i<binary.length;i++) {
			System.out.print("input number: ");
			binary[i] = scan.nextInt();			
		}
		System.out.print("입력한 2진수는 ");
		print(binary);
		
		System.out.println( );
		
		//그레이코드로 변환
		gray[0] = binary[0];
		transe(binary);
		System.out.print("그레이 코드: ");
		print(gray);
	}

}
