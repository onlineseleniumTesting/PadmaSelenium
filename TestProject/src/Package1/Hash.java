package Package1;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<String,Integer> t1= new Hashtable<String,Integer>();
		t1.put("legs", 4); //Store value 4 in key=legs
		t1.put("Eyes", 2);
		t1.put("mouth", 1);
		System.out.println(t1);
		System.out.println(t1.get("Eyes"));
		System.out.println(t1.get("legs"));
		
		Enumeration<String> keys = t1.keys();
		while(keys.hasMoreElements()) {
			String key=keys.nextElement();
			System.out.println("Key:"+ key +",value:"+t1.get(key));
		}
	}

}
