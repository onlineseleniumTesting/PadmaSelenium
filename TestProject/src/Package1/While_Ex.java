package Package1;

public class While_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		//}
		
//		int  i=10;
//		do {
//			System.out.println(i);
//			i--;
//		}while(i>1);
//		
		
		//Factorial of number
		int num=20;
		long fact=1;
		int i=1;
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		System.out.println(fact);
		

	}

}
