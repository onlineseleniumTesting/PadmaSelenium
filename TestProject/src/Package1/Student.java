package Package1;

public class Student {
	
	public Student() {
		System.out.println("Default constructor");
	}
	
	//parameterised construtor
	public Student(String name) {
		this();
		String stdname = name;
		System.out.println("Student name is:"+stdname);
	}
	
	public Student(int rollnum) {
		this("natesh");
		int stdrolnum = rollnum;
		System.out.println("Student name is:"+stdrolnum);
	}
	

	public static void main(String[] args) {
		
		Student stdn=new Student(300);
		Student stdn1= new Student();

	}

}
