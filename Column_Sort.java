package FTD.Assignments;
import java.util.Arrays;

public class Column_Sort
{
	public static void main(String[] args) 
	{
        int[][] arr=new int[][] {new int[] {9,6,5,3,2}, new int[] {1,14,8,5,14},new int[]{5,2,35,52,22}, new int[] {14,10,8,4,23}};
        for (int i=0;i<4;i++) 
        {
            for (int j=0;j<4;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
       int temp[][]=new int[4][4];
       int temp1[][]=new int[4][4];
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr.length;j++) {
        		temp[i][j]=arr[j][i];
        		
        	}
        }
        
        for(int i=0;i<arr.length;i++) {
        	{
        		Arrays.sort(temp[i]);
        	}
        }
        System.out.println();
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
            	temp1[i][j]=temp[j][i];
                System.out.print(temp1[i][j] + " ");
            }
            System.out.println();
        }
        
        }
}
