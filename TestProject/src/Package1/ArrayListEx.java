package Package1;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Button1"); //index=0
		al.add("Button2"); //index=1
		al.add("Button3");
		al.add("Button4");
		al.add("Button4");
		
//		System.out.println(al.get(0));
		System.out.println(al.size());
		for(String num:al) {
			System.out.println(num);
		}
		
		System.out.println("the index is:"+al.indexOf("Button3"));
		System.out.println("********************************");
		al.remove(1);
		System.out.println("The size of al is--"+al.size());
		for(String num:al) {
			System.out.println(num);
		}
		System.out.println("********************************");
		
		al.add(1, "Button2");
		System.out.println("The size of al is--"+al.size());
		for(String num:al) {
			System.out.println(num);
		}
	}

}
