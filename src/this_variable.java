
public class this_variable {

	int a;
	int b;
	
	
	/*		public void value(int a,int b)
	{
		
		this.a=a;
		this.b=b;
	}
	*/
	this_variable(int a, int b)
	{
		
		this.a=a;
		this.b=b;
		
		
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	this_variable tv=new this_variable();
		tv.value(1, 2);
		tv.display();
		*/
		
		this_variable tv1=new this_variable(10,20);
		
		tv1.display();
	
		
	}

}
