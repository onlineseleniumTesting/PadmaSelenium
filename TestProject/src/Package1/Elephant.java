package Package1;

public class Elephant extends Animal1{
	int age=100;
	
	Elephant(){
		System.out.println("elephant is shouting");
	}
	
	
	void welcome() {
		System.out.println("Welcome to elephenat Class");
		super.welome();
	}
	
	void showAge() {
		System.out.println(super.age);
		System.out.println(age);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-cgenerated method stub
		Elephant c =new Elephant();
		c.showAge();
		c.welcome();
	}

}
