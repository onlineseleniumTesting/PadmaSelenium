package Package1;

public class MethodExample {
	
	public MethodExample() {
		System.out.println("test constructor");
	}
	
	static void test1() {
		//test2();
		System.out.println("Test1 method is executed");
	}
	
	public void test2() {
		test1();
		System.out.println("Test2 method is executed");
	}
	
	public int add(int a, int b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
		
		MethodExample m=new MethodExample();
		m.test2();
//		MethodExample me = new MethodExample();
//		me.test2();
//		int returnVal =  me.add(5,4);
//		System.out.println(returnVal);
		
	}

}
