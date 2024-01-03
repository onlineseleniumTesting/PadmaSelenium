package Package1;

public class String_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1=new String();
//		str1 = "Padma is learning selenium";
		
		String str1="Padma is learning selenium";// it has an index 
		String str3="Padma is learning selenium";
		String str2 = "Padma is from USA";
		
		boolean b = str1.equals(str3);
		System.out.println("The string comarision is:-"+b);
		System.out.println(str1.charAt(2));
		System.out.println(str1.indexOf('m'));
		System.out.println(str1.substring(9, 17));
		System.out.println(str2.concat(str1));
		System.out.println(str1.contains("is"));
		
		
		

	}

}
