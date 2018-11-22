
public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("Hello World");
		
		String s1=new String("Hello World");
		
		System.out.println(s==s1);
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
		System.out.println(s.equals(s1));
		
		String s2="Hello World";
		
		String s3="Hello World";
		
		System.out.println(s2==s3);
		
		System.out.println(s==s2);
		
		System.out.println(s.equals(s2));
		
		
		
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println(sb.append("World"));
		
		StringBuilder SB=new StringBuilder("Hello");
				
		System.out.println(SB.append("Java"));		
		
		
		
		
	}

}
