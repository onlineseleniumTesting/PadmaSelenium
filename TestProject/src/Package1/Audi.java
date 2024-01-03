package Package1;

public class Audi extends Car{
	public int speed = 150;
	

	public static void main(String[] args) {
		
		Audi a = new Audi();
		System.out.println(a.getfuel());
		System.out.println(a.speed);
		System.out.println(a.color);
		System.out.println(a.wheels);
		a.seats();
		
		
		
		

	}

}
