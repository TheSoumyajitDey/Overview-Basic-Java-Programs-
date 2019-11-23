 class Employee
    {
        private int Id;
        private String Name;
        private int Age;
        private long Salary;

        public Employee(){
           //Id = 1;
            //Name = "XYZ";
            ////Age = 29;
            //Salary = 45000;
			this(1,"XYZ",29,45000);
        }
		
		 public Employee(int Id, String Name, int Age)          
        {
           //this.Id=Id;
		  // this.Name = Name;
		    //this.Age = Age;
             //this.Salary = 12345;
	     this(Id,Name,Age,12345);
        }

       public Employee(int Id, String Name, int Age, long Salary)          
        {
            this.Id = Id;
            this.Name = Name;
            this.Age = Age;
            this.Salary = Salary;
        }

        public void putData()
        {
            System.out.print("\n\tEmployee Id     : "+Id);
            System.out.print("\n\tEmployee Name   : "+Name);
            System.out.print("\n\tEmployee Age    : "+Age);
            System.out.print("\n\tEmployee Salary : "+Salary);
        }
}

class EmployeeTest{

        public static void main(String args[])
        {

            Employee E = new Employee();// Creating Object
            Employee E1 = new Employee(100,"ABC",23);// Creating Object
             Employee E3=new Employee(101,''mty", 23, 45678);
	       E.putData(); 
           E1.putData();         
        }
    }