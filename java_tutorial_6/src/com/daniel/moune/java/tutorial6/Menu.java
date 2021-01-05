package com.daniel.moune.java.tutorial6;

import java.util.Scanner;
/**
   <p>the menu class to build should look like this
   <p>Student Menu
   <p>-------------------------------
   <ol>
   <li> Create a new student
   <li> delete an existing student
   <li> view the list of students
   <li> quit
   </ol>
   <p>-------------------------------
   <p> Please select the option that you want
   @author Daniel Moune <moune.daniel@ictuniversity.edu.cm>
   @version     %I%, %G%
   @since 1.0
*/

public class Menu{
    /**
       this is the Menu title that appears on top of the menu
    */
	public String title;      // title of the menu
	/**
       this is the list of options that are displayed in the menu
    */
	public String[] options;  // array 
	/**
       this is the prompt that is displayed in order to explain
       to the user what he/she is supposed to do
    */
	public String prompt;
	/**
		this is the value of the user selection from the menu
	*/
	public String user_choice;
	
	/**
		this is the scanner object of the menu Class
	*/
	public Scanner input_scanner;
	
	public byte last_option_index;
	public String bar = "-------------------------------";
	
	/**
	<p>
	  this is the class constructor
	<p>
	  @param menu_title  the menu title 
	*/
	public Menu(String menu_title){
		title = menu_title;
		options = new String[10];
		last_option_index = 0;
		input_scanner = new Scanner(System.in);
	}
	
	/**
	 <p>
	  this is going to add an option to the menu
	 <p>
	  @param desired_option  the option to be added 
	*/
	public void add_option(String desired_option){
		options[last_option_index] = desired_option;
		last_option_index ++;
	}
	
	/**
	 <p>
	  this is going to set the prompt that will be displayed under the menu
	 </p> 
	  @param desired_prompt  the prompt that will be displayed 
	*/
	public void add_prompt(String desired_prompt){
		prompt = desired_prompt;
	}
	
	/**
	  this is going to show the menu on the console
	*/
	public void show(){
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		for (byte k=0; k<last_option_index; k++){
			System.out.println((k+1)+". "+options[k]);
		}
		System.out.println(bar);
		System.out.println("> "+prompt);
	}
	
	/**
 	  <p>
	  this is going to read the user choice and 
	  announce the action that will be executed by the engine
	  <p>
	  @return int   a positive integer representing user selection in the menu or 0 if there was an error
	*/
	public int getUserChoice(){
		
		user_choice = input_scanner.nextLine();
		int user_choice_val = 0;
		
		try{
			// run unsafe code
			user_choice_val = Integer.parseInt(user_choice);
		}catch(Exception e){
			// swallow the exception and report a error to the user
			System.out.println("> Invalid choice format detected ...");
			System.out.println("Please input 1 or 2 or 3 or 4 ...");
		}
		
		if(user_choice_val == 1){
			System.out.println("> Preparing to create a new student ...");
		}else if(user_choice_val == 2){
			System.out.println("> Preparing to delete an existing student ...");
		}else if(user_choice_val == 3){
			System.out.println("> Preparing to display the students' list ...");
		}else if(user_choice_val == 4){
			System.out.println("> Thank you for using the software. Bye ...");
		}else{
			System.out.println("> Invalid choice detected ...");
			System.out.println("Please input 1 or 2 or 3 or 4 ...");
		}
		return user_choice_val;
	}
	
}
