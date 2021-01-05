import java.util.Scanner;
import com.daniel.moune.java.tutorial4.*;
import com.daniel.moune.java.tutorial6.*;

public class Main{
	public static void main(String[] args){

		// create a menu
		Menu app_menu = new Menu ("Student Menu");
		
		// add options and prompt to the menu
		app_menu.add_option("Create a new student");
		app_menu.add_option("Delete an existing student");
		app_menu.add_option("View the list of students");
		app_menu.add_option("quit");
		app_menu.add_prompt("Please select the option that you want");
		
		// show the menu
		app_menu.show();
		while (app_menu.getUserChoice()!= 4){
			// do something while the condition above is true
		};	
	}
}
