package FTD.Assignments.Employee;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Employee e[]=new Employee[5];
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		Employee e5=new Employee();
		try (Scanner sc = new Scanner(System.in)) {
			int ch,a=0;
			boolean exit=true;
			
			e[0]=e1; e[1]=e2; e[2]=e3; e[3]=e4; e[4]=e5;
			e[0].setId(1);
			e[0].setName("Tarun");
			e[0].setOrganization("FTD");
			e[0].setSalary(50000);
			do
			{
				System.out.println("Select your choice \n 1.Add\n 2.Show\n 3.Update\n 4.Delete\n 5.Search\n 6.Exit\nEnter Your Choice:");	
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Add Employee");
					a++;
					System.out.println("Enter id");
					int id =sc.nextInt();
					e[a].setId(id);
					System.out.println("Enter name");
					String name =sc.next();
					e[a].setName(name);
					System.out.println("Enter organization");
					String org=sc.next();
					e[a].setOrganization(org);
					System.out.println("Enter salary");
					int sal=sc.nextInt();
					e[a].setSalary(sal);
					break;         
				case 2: 
					for(int i=0;i<e.length;i++) {
				    if(e[i].getId()!=0)
					System.out.println(e[i].getId()+" "+e[i].getName()+" "+e[i].getOrganization()+" "+e[i].getSalary());
					}
					break;
				case 3:
					System.out.println("Enter the id of employee whom you want to update");
					int updt=sc.nextInt();
					updt-=1;
					System.out.println("Enter 1 to update name, 2 to update organization, 3 to update salary");
					int u=sc.nextInt();
					if(u==1) {
						System.out.println("Enter name");
						String name1 =sc.next();
						e[updt].setName(name1);
					}
					else if(u==2) {
						System.out.println("Enter Organization");
						String org1 =sc.next();
						e[updt].setOrganization(org1);
					}
					else if(u==3) {
						System.out.println("Enter Salary");
						int sal1 =sc.nextInt();
						e[updt].setSalary(sal1);
					}
					else
						System.out.println("Invalid");
						
					break;
					
				case 4:
					System.out.println("Enter id you want to delete");
					int del=sc.nextInt();
					del-=1;
					e[del].setId(0); e[del].setName(null);e[del].setOrganization(null);e[del].setSalary(0);	
					break;
				case 5:
					System.out.println("Enter id you want to search");
					int srch=sc.nextInt();
					srch-=1;
					if(e[srch].getId()!=0)
					System.out.println(e[srch].getId()+" "+e[srch].getName()+" "+e[srch].getOrganization()+" "+e[srch].getSalary());
					else
						throw new NoSuchRecordException("please enter valid employee id that existed");
					break;
				case 6:
					exit=false;	
				}
			}while(exit);
		}
	}

}