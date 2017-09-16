
public class EmployeeDetails {
	static int jobLocation = 3560; //class variable
	int empID; //instance variable
	String salary;
	
	public int getId() {
		empID++;
		jobLocation++;
		return empID;
	}
	
	public int getLocation() {
		
		int i = 5; //local variable
		System.out.println("Local var =" +i);
		jobLocation++;
		return jobLocation;
	}
	
	public String getSalary() {
		System.out.println("Salary is " + empID);
		return salary;
	}
	
	public static String getName(){
		String name="123";
		return name;
	}
}
	