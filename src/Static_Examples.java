
public class Static_Examples {

	
	int a=10;
	
	static int b=20;
	
	
	public void test()
	{
		
		System.out.println("a="+a);
		
		System.out.println("b="+b);
		
	}
	
	public static void test1()
	{

		// Static method cannot access non static variables and non static methods
		// System.out.println(a);
		
		System.out.println("b="+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_Examples.test1();
		
		Static_Examples s1=new Static_Examples();
		
		s1.test();
		
	}

}
