
public class Remove_DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*		 int a[]= {1,3,4,1,5,5,6,7,2};
		 
		 int count=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 
			 for(int j=0;j<a.length;j++)
			 {
				 
				if(a[i]==a[j])
				{
					count++;
					
				}
				
			 }
			 
			 if(count==2)
			 {
				 System.out.println(a[i]);
			 }
			 count=0;
		 }
		 
		 */
		
		int a[]= {1,3,4,8,2,7,9};
	
		int temp;
		for(int i=0;i<a.length;i++)
		{
			
			if(i%2==0)
			{
		
			
			System.out.println(a[i]);	
			
			
			for(int j=0;j<a.length;j++)
			{
				for(int k=i+1;k<a.length;k++)
				{
					
					if(a[j]>a[k])
					{
						
						temp=a[j];
						
						a[j]=a[k];
						
						a[k]=temp;
						
					}
					
					
				}
				
			}
			for(int j=0;j<a.length;j++)
			{
				
				System.out.println(a[j]);
			}
				
			}	
			
		}
		
	
		

		
	}

}
