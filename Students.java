package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is" +id);
		}

	public void getStudentInfo(String name) {
		System.out.println("Student Name is" +name);
		}
	

	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Student email and phoneNumber are " +email  +phoneNumber);
		}
	
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(2815);
		std.getStudentInfo("Malar");
		std.getStudentInfo("mathymalar.kv@gmail.com", 987654321);
	}

}
