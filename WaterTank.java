package FTD.Assignments;

import java.util.*;

public class WaterTank 
{
	@SuppressWarnings("resource")
	public static void main(String args[]) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(0);
		a.add(3);
		a.add(0);
		a.add(5);
		a.add(0);
		a.add(0);
		System.out.println(a);
		Scanner sc=new Scanner(System.in);
		int ltr=0,lev=0;int k;
		System.out.println("Enter no of litres to be stored");
		k = sc.nextInt();
		while(ltr<k) 
		{	
			for(int i=0;i<a.size();i++) 
			{
				if(a.get(i)==0)
				{
					ltr++;
				}
				else
				{
					a.set(i,a.get(i)-1);
				}
			}
			lev++;		
		}	
		System.out.println("No of levels "+lev);
	}
}
