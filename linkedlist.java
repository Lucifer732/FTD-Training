package sample.test1;
import java.util.*;

public class linkedlist 
{
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.addLast("g");
		list.addFirst("hello");
		list.add("f");
		list.addLast("ng");
		list.addFirst("sd");
		list.add(3,"c");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		for(String i: list)
		{
			System.out.print(i);
		}
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		list.remove(2);
		list.remove("ng");
		list.remove();
		list.remove();
		System.out.println(list);
	}
}
