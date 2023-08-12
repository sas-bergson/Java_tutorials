
public class Wellcome{
	public static void main(String[] args){
		Student new_student = new Student(); // creates a new object that represents the student John Doe
		new_student.name = "John Doe";
		new_student.matricule = "ICTU202365987";
		new_student.phoneNumber = 655718426;
		System.out.println("Welcome to " + new_student.name);
		System.out.println("your matricule is  " + new_student.matricule);
		System.out.println("your phone number is " + new_student.phoneNumber);
	}
}
