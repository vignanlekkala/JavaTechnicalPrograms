class Test
{
	Test()
	{
		System.out.println("default constructor");
	}
  	
}

class Test1 extends Test
{
	
	Test1(int a)
	{
		super();
		System.out.println(a);
		
	}
}


public class Super_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t1=new Test1(10);
		
		
		
	}

}
