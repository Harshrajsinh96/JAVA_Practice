
public class Employee extends EmployeeDetails{
	public static int empID;
	 final static int a=10;
	public static void valA(){
		//a=a+5;
		//Employee.a = Employee.a+5;
		System.out.println(a);;
	}
	public  int getId() {
		empID++;
		System.out.println(empID);
		return empID;}
	
	public static String getName(){
		String name="12345";
		return name;
	}
	
	public static void main (String [] args){
		valA();
		
		System.out.println(getName());
		System.out.println(EmployeeDetails.getName());
		
		
		//EmployeeDetails emp = new EmployeeDetails(); //emp is reference variable & new EmployeeDetails() is a new instance/object.
		//getId();
//		emp.getSalary();
//		
//		System.out.println("Curr value: "+ EmployeeDetails.jobLocation);
//		System.out.println("Curr value: "+ emp.getLocation());
//		System.out.println("Curr value: "+ emp.jobLocation);
//
//		
//		emp.getId();
//		emp.getSalary();
		
		
//		
//		System.out.println("-------------------------");
//		
//		EmployeeDetails emp2 = new EmployeeDetails();
//		emp2.getId();
//		emp2.getSalary();
//		
//		System.out.println("Curr value: "+ EmployeeDetails.jobLocation);
//		System.out.println("Curr value: "+ emp2.getLocation());
//		
//		emp2.getId();
//		emp2.getSalary();
	}
}
