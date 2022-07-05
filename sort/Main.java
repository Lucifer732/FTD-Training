package FTD.Assignments.sort;

public class Main 
{
	public static void main(String[] args)
	{
		Student a[]=new Student[5];
	    Student s1=new Student("Tarun",3, "CPP");
	    Student s2=new Student("Teja",9, "Java");
	    Student s3=new Student("Snigdha", 8,"CPP");
	    Student s4=new Student("sajid",1, "Python");
	    Student s5=new Student("prami",2 ,"SQL");
	    a[0]=s5;
	    a[1]=s4;
	    a[2]=s3;
	    a[3]=s2;
	    a[4]=s1;
	    System.out.println();
	    for(int i=0;i< a.length-1; i++)
	    {
	    	for(int j=i+1;j< a.length;j++)
	    	{
	    		if(a[i].getAge() > a[j].getAge())
	    		{
	    			Student temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;	    			
	    		}
	    		
	    	}
	    }
	    for(int k=0;k<a.length; k++) 
	    {
		    System.out.print(a[k].getName()+" ");
		    System.out.print(a[k].getAge()+" ");
		    System.out.print(a[k].getSubject()+" ");
		    System.out.println();
	    }		
	}
}

