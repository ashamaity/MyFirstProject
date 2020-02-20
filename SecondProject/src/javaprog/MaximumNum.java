package javaprog;

public class MaximumNum {

	public static void main(String[] args) {
		
		int a[]= {4,8,6,2,6,8,10,5};
		int max= a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			
				if(a[i]>max)
					
				{
					max=a[i];
				}
			}
			System.out.println(max);
		}

	}


