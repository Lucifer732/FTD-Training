package sample.test1;

import java.util.*;

public class Haset {
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		HashSet<List<String>> set = new HashSet<>();
		List<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("hi");
		arr.add("Ftd");
		set.add(arr);
		System.out.println("Original Hash: "+set);
		HashSet<String> clone_set = new HashSet<>();
		clone_set = (HashSet<String>)set.clone();
		System.out.println("New hash "+ clone_set);
		arr.remove("hi");
		System.out.println("After removing elements");
		System.out.println("original hash: "+set);
		System.out.println("New hash "+ clone_set);
	}
}
