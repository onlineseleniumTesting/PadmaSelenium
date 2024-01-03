package Package1;
//import statements
public class SwithExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num1=2, num2=5;
		char operator = '^';
		double output;
		switch(operator) 
		{
		
			case '+':
				output = num1+num2;
				System.out.println("Addition value is:"+output);
				break;
			case '-':
				output = num1-num2;
				System.out.println("substrction value is:"+output);
				break;
			case '*':
				output = num1*num2;
				System.out.println("Multiplication value is:"+output);
				break;
			case '/':
				output = num1/num2;
				System.out.println("division value is:"+output);
				break;
			default:
				System.out.println("Invalid operator");
		}

	}

}
