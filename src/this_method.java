
public class this_method {

	public void A()
	{
		System.out.println("A");
		
		
	}
	
	public void B()
	{
		
		A(); 
		
		//this.A() and A() both are same
		// compiler considers A() as this.A() 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_method tm=new this_method();
		
		tm.B();
		
	}

}
