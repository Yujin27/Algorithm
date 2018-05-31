import java.util.Scanner;

public class A_12 {

	public static int fac(int n) {
	 	if(n <= 1) 
	 		return n;
		else 
			return fac(n-1)*n;
	 	
		/*	System.out.println("---");
		System.out.println(fac(3));
		System.out.println("---");
	*/	
	 	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 1;
	    long sum = 0; 
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("input: ");
	    int n = sc.nextInt();
	    int x = n;
	    
		/*for(int j = 1; j < 21; j++) {
			k = k * j;
			sum = sum + k;
			System.out.println(sum);
		}*/
		
	      for(int i=1; i<=n; i++) { //i를 x에서 시작해서 1까지 감소시키며 sum을 구하는 방법?
	     	  
	    	  for(int j=x; j>=1; j--) {
	    		 k = k*j;
	    		 //System.out.println(j + " / " + k);
	     		 }
	    	  
	    	  System.out.println(x + "!은 " + k);	    	  
	    	  sum=sum+k;
	    	  x=x-1;
	    	  k=1;
	    	  System.out.println(i + "번째 항 --> " + sum);
	    	  System.out.println();
		     	  
	      }

	}
}
