public class Fruit {
 
	private String name = "Apple";
   Fruit(){
	   
   }	
   public Fruit(String name) {
	   this.name = name;
   }

   public String getFruitName(){
	   return name;
   }
   
   public void setFruitName(String name){
	   this.name = name;
   }
   
   public static void main(String []args) {
      
      Fruit A = new Fruit();
      System.out.println(A.name);
      
      Fruit B = new Fruit("Lemon");
      System.out.println(B.name);
      
      A.setFruitName("Orange");
      System.out.println(A.name);
      System.out.println(A.getFruitName());
      
   }
}