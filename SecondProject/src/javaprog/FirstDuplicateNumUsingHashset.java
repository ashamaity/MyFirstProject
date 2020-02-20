package javaprog;

import java.util.HashSet;

public class FirstDuplicateNumUsingHashset {

	public static void main(String[] args) {
		
		int n[]= {7,8,5,2,4,8,6,4,1,7,5};
		int temp=0;
		
		
		HashSet <Integer> hs=new HashSet<>();
		for(int i=n.length-1;i>=0;i--)
		{
			if(hs.contains(n[i]))
			{
				 temp=i;
			}
			else
			{
				hs.add(n[i]);
			}
		}
		if(temp!=-1)
		{
			System.out.println("First Duplicate Element :"+n[temp]);
		}
		else
		{
			System.out.println("Duplicate number is not present in the array");
		}

	}

}
