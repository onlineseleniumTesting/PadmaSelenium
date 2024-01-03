package Package1;

public class Exhandle {
	
	public static void test() throws InterruptedException, ArrayIndexOutOfBoundsException {
		Thread.sleep(5000);
	}

	public static void main(String[] args) {
//		System.out.println("Start of the program");
//		try {
//			int i=50/0;
//			System.out.println("the i value is:"+i);
//		}finally {
//			System.out.println("Inside finally block");
//		}
//		
//		System.out.println("end of the program");
//		try {
//			test();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		throw new ArithmeticException("/ by zero");
//		
//		int a[] = {30,40,50};
//		System.out.println(a[5]);
		
		
		System.out.println("program starts");
		try {
			int i=10/0;
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block is executing");
		}
		System.out.println("program ends");
		
	}

}
