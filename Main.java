import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		/*a prompt asking about what their name is*/
		Scanner name = new Scanner(System.in);
		System.out.print("What's your name?");
		String user_name = name.nextLine();
		
		/*a prompt asking what job they want. maybe there's
		a way to let user see what their options are*/
		String[] job_options = {"Doctor", "Software Developer", "Pilot", "Astronaut",
								"Teacher/Professor", "Nurse", "Investment Banker",
								"Stock Broker", "Accountant", "Entrepreneur", "Lawyer",
								"Writer/Author", "Engineer", "Architect", "Chef",
								"Social Worker"};
		Scanner career = new Scanner(System.in);
		System.out.println("Here are a list of jobs:");
		//parse through jobs and print on individual lines
		for(int i=0; i < job_options.length; i++){
			System.out.println(job_options[i]);
		}
		System.out.print("What job do you want?");
		String user_career = career.nextLine();
		
		/*a prompt asking them to make an action for paying bills*/
		
		
		/*a prompt asking how much they want to save*/
		
		
		/*a prompt showing them their spending on fixed expenses*/
		
		
		/*a section showing what their total $$, credit & wellness
		points are*/
		
		
	}//end of public static void
}//end of main class
