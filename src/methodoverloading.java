
public class methodoverloading {

	public void add(int a,int b)
	{
	    int c=a+b; 	
	    
	    System.out.println("int,int");
	    
	    System.out.println(c);
	}
	
	public void add(int a,float b)
	{
          float c=a+b; 
          
          System.out.println("int,float");
          System.out.println(c);          
          
	}
	
	public void add(float a,float b,int c)
	{
		float d=a+b+c; 
        
        System.out.println("float,float,int");
        System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverloading mo=new methodoverloading();
		
		mo.add(10, 20);
		mo.add(10, 30.1f);
		mo.add(10, 30, 30);
		
		
		
	}

}
