//10진수 -> 2변환
//2로나눴을때 나머지

import java.util.Scanner;

public class trans2 {
	public static void main(String[] args) {
		
		int quotient = 0; //몫
		int remainder = 0; //나머지
		int [] binary = new int [4]; //결과값
		
		System.out.print("input number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			/*if(num>=0 && num<= 15) {
				quotient = num/2;
				binary[3] = num % 2;
				
				System.out.println(quotient + " " + remainder);
				
				for(int k =1; k<=3;k++) {
					binary[3-k] = quotient%2;
					quotient = quotient/2;
				}
				
				for(int i=3; i<=0; i--) {
					binary[i] = remainder;
				}
				for(int j =0; j>=binary.length;j++) {
					System.out.println(binary[j]);
				}
			}
			else {
				System.out.println("0~15 사이의 수를 입력해주세요.");
			}*/

		quotient = num/2;
		binary[3] = num % 2;
		
		for(int k =0; k<3;k++) {
			binary[2-k] = quotient%2;
			quotient = quotient/2;
			System.out.println(quotient);
		}
		
		System.out.println("-");
		
		for(int i=3; i<=0; i--) {
			binary[i] = remainder;
		}
		System.out.println(binary[0]);
	}

}
