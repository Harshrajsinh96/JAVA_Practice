 
class A{  
	public int data=2147483647;  
	//private	void msg(){System.out.println("I am private");} 
	protected double c=131313.131313;
}  
  
public class checkMod extends A{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println("Public is: " +obj.data);
   //obj.msg(); 
   System.out.println();
   System.out.println("Protected is: " +obj.c);
   
   }  
}