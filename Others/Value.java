public class Value
{
	public static void main(String[] args)
	{
		double[] arr=new double[10];
			
		for(int i=1; i <10; i++)
		{
		double t,r,u,x,y,n ;
		
		t=  (2 * Math.PI * Math.random());
		u= Math.random() + Math.random();
		if (u>1)
			r = 2-u;
		else
			r = u;
		
		x= r * Math.cos(t);
		y= r * Math.sin(t);
		n= Math.sqrt(Math.pow((x), 2) + Math.pow((y), 2));
		arr[i]=n;
		}
		
		for(int i=1; i<10; i++)
		{
			System.out.println("" + arr[i]);
		}
	}
}