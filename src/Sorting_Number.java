
public class Sorting_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,6,4,3,1};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i ;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					
					a[i]=a[j];
					
					a[j]=temp;
					 
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
