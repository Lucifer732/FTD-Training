package FTD.Assignments.RankSort;

import java.util.*;
public class rank 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
        ArrayList<Integer> al=new ArrayList<>();
        int num;
        Scanner sc=new Scanner(System.in);
        while((num=sc.nextInt())!=-1)
        {
            al.add(num);
        }
        sorting(al);
        System.out.println(al);
    }
    private static void sorting(ArrayList<Integer> al) 
    {
        PriorityQueue<Num> pq=new PriorityQueue<>(new Comparator<Num>() 
        {
            public int compare(Num o1, Num o2) 
            {
                return o2.value-o1.value;
            }   
        });
        for(int i=0;i<al.size();i++)
            pq.add(new Num(al.get(i),i));
        int rank=al.size();
        while (!pq.isEmpty()) {
            al.set(pq.poll().rankk,rank);
            --rank;
        }
    }
}
