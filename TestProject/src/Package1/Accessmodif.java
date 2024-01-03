package Package1;

public class Accessmodif {
	
	public static int i=10;
	private static String str="hello";
	protected static double d=34.34;
	static char c='g';
	
	public static void test_pub() {
		System.out.println("test public method");
	}
	private static void test_pri() {
		System.out.println("test private method");
	}
	protected static void test_pro() {
		System.out.println("test protected method");
	}
	static void test_nomod() {
		System.out.println("test no mod method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test_pub();
		test_pri();
		test_pro();
		test_nomod();
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(d);
		System.out.println(c);

	}

}
