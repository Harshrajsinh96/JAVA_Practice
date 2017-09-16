
public class chap4test {

	public static void main(String[] args) {

//		float f1 = 2.3f;
//		float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
//		float[] f3 = {2.7f};
//		
//		System.out.println(f2[2]);
		
		Integer i3 = 127;
		Integer i4 = 127;
		if(i3 == i4) 
			System.out.println("same object");
		if(i3.equals(i4)) 
			System.out.println("meaningfully equal");
	}
	
}
