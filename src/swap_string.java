
public class swap_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 // Declare two strings 
        String a = "Hello"; 
        String b = "World"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
        
           
        // append 2nd string to 1st 
        a = a + b; 
       
        System.out.println(a.length());
        System.out.println(b.length()); 
        // store intial string a in string b 
        b = a.substring(0,a.length()-b.length()); 
       
        System.out.println(b);
        System.out.println(a);
          
        // store initial string b in string a 
        a = a.substring(b.length()); 
        
        // print String after swapping 
        System.out.println("Strings after swap: a = " +  
                                     a + " and b = " + b);   
        
        
   
    
        
        
        
        
  
		
	}

}
