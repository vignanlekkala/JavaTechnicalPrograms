
public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		
	while(a<=10)
	{
		System.out.println(a);
		a++;	
	}
	
	

		int count = 0;
		
String s="HelloWorld";


for(int i=0;i<s.length();i++)
{
	
	for(int j=0;j<s.length();j++)
	{
		
		if(i!=j && s.charAt(i)==s.charAt(j))
		{
			count=count+1;
		
			break;
		}
		
	}
	
	if(count==0)
	{
	   System.out.println(s.charAt(i));	
	   break;
	}
	
	count=0;
	
}
		}  	
		
	}


