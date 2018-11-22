
public class Getmethod {

	int a=30;
	
	static int b=40;
	
	public int getA()
	{
		
		System.out.println(a);
		
		return a;
	}
	
	public static void test2()
	{
		System.out.println(b);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Getmethod.test2();
		
		Getmethod gm=new Getmethod();
		
		gm.getA();
		
	}

}
