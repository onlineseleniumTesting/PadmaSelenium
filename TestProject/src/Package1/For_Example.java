package Package1;

public class For_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<5;i++) {
			
			System.out.println(i);
		}
		
//		int table=678;
//		for(int i=1;i<=20;i++) {
//			System.out.println(table+"*"+i+"="+table*i);
//		}
		
		
//		int factNum = 7;
//		long fact  = 1;
//		
//		for(int i=1;i<=factNum;i++) {
//			
//			fact = fact*i;
//		}
//		System.out.println("Factorial of "+factNum+" is : "+fact);
//		
//		
//		 for (int i=1;i<=5;i++) {
//			 
//			 for(int j=1;j<=i;j++) {
//				 
//				 System.out.print("* ");
//			 }
//			 System.out.println();
//		 }
		
		
		int count=7, num1=0, num2=1;
		for(int i=1;i<=count;i++) {
			System.out.println(num1+" ");
			
			int sumofPrevTwo = num1+num2;
			num1 = num2;
			num2 = sumofPrevTwo;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
