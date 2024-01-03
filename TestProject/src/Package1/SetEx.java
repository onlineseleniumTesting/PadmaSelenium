package Package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//College c=new ComptDept();
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		System.out.println(set);
//		Iterator<Integer> it = set.iterator();
////		System.out.println(it.next());
////		System.out.println(it.next());
////		System.out.println(it.next());
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		for(Integer i:set) {
			System.out.println(i + "");
		}
		System.out.println(set.contains(34));
		

	}

}
