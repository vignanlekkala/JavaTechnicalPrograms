
public class Stringpolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb=new StringBuffer("madam");
		
		StringBuffer sb1=	sb.reverse();
		
		System.out.println(sb.equals(sb1));
		
		
		
		String s="madam";
		
		
		String rev="";
		
	//	System.out.println(s.equals(s1));
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
				
		}
		
		System.out.println("String reverse="+rev);
		
		System.out.println(s.equals(rev));

		
		
		
	}

}
