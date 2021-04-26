package day2HomeWork;

public class Teacher {

	public Teacher () {
		
	}
	
	public Teacher (int TcNo, String name, int ID, String phonNumber ) {
		
		this();
		this.TcNo = TcNo;
		this.name = name;
		this.ID = ID;
		this.phoneNumber = phoneNumber;	
	}
	
	int TcNo;
	String name;
	int ID;
	String phoneNumber;
}
