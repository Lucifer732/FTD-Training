package sample.test1;

public class gen 
{
	public static <T extends Comparable<T>> T maximum(T a, T b, T c)
	{
		T max=a;
		if(b.compareTo(max)>0)
		{
			max=b;
		}
		if(c.compareTo(max)>0)
		{
			max=c;
		}
		return max;
	}
	public static void main(String args[])
	{
		System.out.println("Maximum in Integers values is: "+maximum(1,2,3));
		System.out.println("Maximum in Double values is: "+maximum(1.1,3.3,0.5));
		System.out.println("Maximum in String values is: "+maximum("rishi", "rushabh", "ram"));
	}
}
