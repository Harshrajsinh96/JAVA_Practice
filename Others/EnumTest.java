class enumClass{
	enum check{Yes, No, Maybe}
	check a;
}
public class EnumTest {

	  public static void main(String[] args) {
		enumClass ok= new enumClass();
		ok.a=enumClass.check.Maybe ;
		System.out.println("Size: "+ok.a);
	}
}
