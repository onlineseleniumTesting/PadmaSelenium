package Package1;

public class Ford extends Car {
	
	//parent class method seats is overridden in child class
	protected void seats() {
		int seat = 6;
		System.out.println("Car seats="+seat);
	}

	public static void main(String[] args) {
		
		Car c = new Ford(); //Created ford class object with car class reference
		c.seats();

	}

}
