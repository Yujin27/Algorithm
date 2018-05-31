import java.util.Scanner;

public class Score{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//사원점수입력
		for(int i =0; i<a.length;i++) {
			System.out.println(i+1+"번째 사원 점수 입력: ");
			a[i] = sc.nextInt();
		}		
		
		//사원점수출력
		for(int j =0; j<a.length;j++) {
		System.out.print(a[j] + "점 / ");
		}
		System.out.println( );

		//최고,최저값 초기값은 a[0]
		int max = a[0];
		int min = a[0];
		
		//가장 큰 점수와 가장 작은 점수 출력
		for(int k =1; k<a.length;k++) {
			if(a[k] > max) 	
				max = a[k];
			if(a[k] < min) 
				min = a[k];
		}
		System.out.println("최고점: " + max + " / " + "최저점: " + min);
		
		//합계저장할변수
		int sum =0;
		
		//최고최저점제외합
		
		for(int m =0;m<a.length;m++) {
			sum = sum + a[m];
			if(a[m] == max) sum = sum - max;
			if(a[m] == min) sum = sum - min;
		}
		System.out.println("최고,최저점 제외 합: "+sum + "점");
		
		//평균저장할변수
		int avg =0;
		
		//평균점수
		for(int b=0; b<a.length;b++) {
			avg = avg + a[b];
		}
		System.out.println("평균은 " + avg / a.length + "점");
	}
}