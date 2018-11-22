class A
{
	int a=10;
	public void display()
	{
		
		
		System.out.println(a);
	}
}

class B extends A
{
	int a=20;
	public void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	
}



public class superkeyword_variable  extends B{
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superkeyword_variable sk=new superkeyword_variable();
				
				sk.show();
		
	}

}
