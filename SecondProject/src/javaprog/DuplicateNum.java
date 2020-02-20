package javaprog;

public class DuplicateNum {

	public static void main(String[] args) {
		
		int[] a= {4,8,2,7,6,1,6,10,5,8};
		
		for(int i=0;i<=a.length-1;i++)
		{
			int temp=0;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("First duplicate element :"+a[i]);
					temp=temp+1;
					break;
				}
			}
			if(temp>0)
			{
				break;
			}
		}
		
		

	}

}
