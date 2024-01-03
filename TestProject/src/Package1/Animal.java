package Package1;

public abstract class Animal {

	public void eat(String food) {
		System.out.println("Eating");
	}
	
	public static void sleep(int hours) {
		System.out.println("sleeping hours:-"+hours);
	}
	
	public abstract void makeNoise();
	
}
