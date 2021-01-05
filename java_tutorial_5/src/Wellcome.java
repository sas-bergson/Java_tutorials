import java.util.Scanner;
import com.daniel.moune.java.tutorial4.Student;

public class Wellcome{
	public static void main(String[] args){
	
		// create a new student
		Student new_student = new Student(); 
		Scanner input = new Scanner(System.in);
		
		// Intro of the program
		System.out.println("Hello New Student !!!!!");
		System.out.println("------------------");
		
		// Ask for the user personal informations
		System.out.print("Please, What is your name? : ");
		new_student.name = input.nextLine();		
		System.out.print("Input your matricule : ");
		new_student.matricule = input.nextLine();
		System.out.print("Input your phone nbr : ");
		new_student.phoneNumber = input.nextInt();
		System.out.println("----------------------------");
		System.out.println("Welcome to " + new_student.name);
	}
}
