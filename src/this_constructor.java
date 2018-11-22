
public class this_constructor {

	
	this_constructor(int a)
	{
		
		System.out.println(a);
	}
	
	this_constructor(int b,int c)
	{
		this(10);
		System.out.println(b+"..."+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_constructor tc=new this_constructor(10, 20);
		
	
		
	}

}
