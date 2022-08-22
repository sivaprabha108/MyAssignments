package week3.override;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Student id is :" + id);
		System.out.println("...............................");
	}

	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id is :" + id);
		System.out.println("Student name is :" + name);
		System.out.println("...............................");
	}
	
	public void getStudentInfo(String email, long phoneNumber)
	{
		System.out.println("Student email id is :" + email);
		System.out.println("Student phonenumber is :" + phoneNumber);
		System.out.println("...............................");
	}
	
	public static void main(String[] args) {
		 
		Students students = new Students();
		students.getStudentInfo(5263);
		students.getStudentInfo(5263, "Sivaprabha");
		students.getStudentInfo("sivaprabha108@gmail.com", 9952957487L);
	}
	
	
}
