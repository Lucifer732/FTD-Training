package sample.test1;

import java.util.*;

public class Treeset 
{
	public static void main(String args[])
	{
		TreeSet<String> tree= new TreeSet<>();
		tree.add("A");
		tree.add("Z");
		tree.add("b");
		tree.add("C");
		tree.add("a");
		tree.add("B");
		System.out.println(tree);
		tree.remove("s");
		System.out.println(tree);
	}
}
