class first
{
	
	void print()
	{
		
		System.out.println("Hello World");
	}
	
	void show()
	{
		
		System.out.println("Hello Java world");
	}
}

class second extends first
{
	
	void display()
	{
		System.out.println("Welcome to selenium");
		
	}
	
	void show()
	{
		
		System.out.println("Hello QTP world");
		
	}
}


class third extends second 
{

	void show()
	{
		super.show();
		System.out.println("Hello Winrunner world");
		
	}
}
public class Super_Method extends third{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Super_Method sm=new Super_Method();
		
		sm.print();
		sm.show();
		sm.display();
	}

}
