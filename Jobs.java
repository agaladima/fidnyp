import java.util.*;


public class Jobs {
	public static void main(String[] args){
		//eventually the string "the_job" will e an input from somewhere else
		String the_job = "Entrepreneur";
		int the_salary = salary(the_job);
		System.out.println(the_salary);
	}
	
	public static int salary(String job){
		//List of jobs and the salaries
		HashMap<Integer,String> myMap = new HashMap<Integer,String>();
		
		myMap.put(14417,"Doctor");
		myMap.put(13912,"Software_Developer");
		myMap.put(10083, "Pilot");
		myMap.put(6250,"Astronaut");
		myMap.put(4833,"Teacher_Professor");
		myMap.put(5917,"Nurse");
		myMap.put(8750,"Investment_Banker");
		myMap.put(5000,"Stock_Broker");
		myMap.put(4167,"Accountant");
		myMap.put(9000,"Entrepreneur");
		myMap.put(10000,"Lawyer");
		myMap.put(5500,"Writer_Author");
		myMap.put(6500,"Engineer");
		myMap.put(4500,"Architect");
		myMap.put(4300,"Chef");
		myMap.put(3300,"Social_Worker");
		
		//where I will store the returned key
		int el_salary = 0;
		
		//if the string "job" matches then return the numerical value
		for(Integer key : myMap.keySet()){
			if(job.equals(myMap.get(key))){
				el_salary = key;
			}
		}//...end of for loop
		return el_salary;
	}//...end of salary
}
