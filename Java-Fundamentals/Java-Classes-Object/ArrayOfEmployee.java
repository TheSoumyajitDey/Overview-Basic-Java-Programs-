import java.util.*;
class Employee{
	private int empID;
	private String empName;
	private float salary;
	
	public Employee(int empID, String empName, float salary){
		this.empID=empID;
		this.empName=empName;
		this.salary=salary;
        }   
		
	public int getEid()
	{
		return empID;
	}
	
	public String getName()
	{
		return empName;
	}
        public float getSal()
	{
		return salary;
	}



 }       
class EmpDel{
         public static void main(String args[]){
         int i=0,j=0;
         System.out.println("Enter How many Employee");
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         Employee e[]=new Employee[n];
        
         for (i=0; i<n; i++){
         System.out.println("Enter Employee Id, Name, Salary of the Employee"+(i+1));
         	int eid=s.nextInt();
         	s.nextLine();
         	String name=s.nextLine();
         	float sal=s.nextFloat();
         	e[i]=new Employee( eid, name, sal);
         
	}
     
	float max=e[0].getSal();
	for (i=0; i<n; i++) {
            		if(e[i].getSal()>max){
                         	max=e[i].getSal();
                                 j=i;
                           }
                        
     	    }
            System.out.println( "EID:"+e[j].getEid()+", Name:"+ e[j].getName()+"Salary:"+e[j].getSal()); 
               
        }
        

		
}
