//분수합 구하는 알고리즘

public class Fraction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0; //분자
		int b = 1; //분모
		int k;
		
		for(int i =0; i<99;i++) {
			a = a+1;
			b = b+1;
			k = a/b;
					
			if(a % 2 != 0) { //분자 홀수일때 -1
				System.out.print("-(" + a + "/" + b + ")" );
			}
			else {
				System.out.print("+(" + a + "/" + b + ")");
			}
	}
}
}