package Package1;

import java.util.Scanner;

public class If_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=30;
//		if(i<20) {
//			System.out.println("i is less than 20");
//		}else {
//			System.out.println("i is greater than 20");
//		}
		
//		String sDay = "Sat";
//		if(sDay.equals("sunday")) {
//			System.out.println("Today is sunday");
//		}else if(sDay.equals("Friday")) {
//			System.out.println("Today is Friday");
//		}
//		else {
//			System.out.println("Today is not sunday or friday but and ofcouse its-"+sDay);
//		}
		
		
//		int num=24;
//		
//		if(num <10 && num>=1) {
//			System.out.println("its a one digit number");
//		}
//		else if(num <100 && num>=10) {
//			System.out.println("its a two digit number");
//		}else if(num <1000 && num>=100) {
//			System.out.println("its a three digit number");
//		}else if(num <10000 && num>=1000) {
//			System.out.println("its a four digit number");
//		}else if(num <100000 && num>=10000) {
//			System.out.println("its a five digit number");
//		}else {
//			System.out.println("number is not between 1 and 99999");
//		}
		
		
//		int num=0;
//		if(num >=0) {
//			System.out.println("Positive number");
//		}else if(num<0) {
//			System.out.println("its a negative number");
//		}else {
//			System.out.println("Number is neither positive nor negative");
//		}
		
//		
//		int num;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number to check the even or odd");
//		num = scan.nextInt();
//		if(num%2==0) {
//			System.out.println("Even number");
//		}else {
//			System.out.println("Odd number");
//		}
		
//		si=ptr/100;
		
		float p,r,t, sinterest;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		p = scan.nextFloat();
		System.out.println("Enter the Rate of interest: ");
		r = scan.nextFloat();
		System.out.println("Enter the Time ");
		t = scan.nextFloat();
		scan.close();
		sinterest = (p*r*t)/100;
		System.out.println("Simple interest is :" +sinterest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
