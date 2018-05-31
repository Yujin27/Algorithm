//5*5

public class array_25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int[5][5];
		int k  = 0;
		
		for(int i = 0;i<5;i++) {
			for(int j = 0; j<5;j++) {
				k=k+1;
				a[i][j] = 26-k;
				System.out.print(a[i][j] + " / ");	
			}
			System.out.println(" ");
		}
	}
}