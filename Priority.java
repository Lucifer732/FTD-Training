package sample.test1;

import java.util.*;

public class Priority
{
	public static void main(String args[])
	{
		List<Integer> arr= new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int a;
			while(n!=0)
			{
				a=sc.nextInt();
				arr.add(a);
				n--;
			}
		} 
		System.out.println(arr);
		index(arr);
	}

	private static void index(List<Integer>arr)
	{
		// TODO Auto-generated method stub
		PriorityQueue<Integer> qu= new PriorityQueue<>();
		for(int i=0;i<arr.size();i++)
		{
			qu.add(arr.get(i));
		}	
	}
}