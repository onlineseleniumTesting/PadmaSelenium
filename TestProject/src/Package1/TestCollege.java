package Package1;

public class TestCollege {

	public static void main(String[] args) {
		
		System.out.println(College.Collegename);
		
		College cd=new ComputerDept();
		cd.studentDetails();
		cd.studentResults();
		
		College md=new MechanicalDept();
		md.studentDetails();
		md.studentResults();
	}

}
