import java.util.Scanner;

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
		System.out.println("your matricule is  " + new_student.matricule);
		System.out.println("your phone number is " + new_student.phoneNumber);
	}
}
