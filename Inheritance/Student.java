class Student extends Hostel implements Department
{
	private String studentName;
	private int regdNum;
	private String electiveSub;
	private double avgMarks;
	
	public Student(String hostelName,String hostelLocation,int numOfRooms,String studentName,int regdNum,String electiveSub,double avgMarks)
	{
	    super(hostelName,hostelLocation,numOfRooms);
		this.studentName=studentName;
		this.regdNum=regdNum;
		this.electiveSub=electiveSub;
		this.avgMarks=avgMarks;
	}
	
	public void print()
	{
		System.out.println("Department Name: "+Department.deptName);
		System.out.println("Department Head: "+Department.deptHead);
		System.out.println("Hostel Name: "+hostelName);
		System.out.println("Hostel Location: "+hostelLocation);
		System.out.println("Number Of Rooms in Hostel: "+numOfRooms);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Registration Number: "+regdNum);
		System.out.println("Selected Subject: "+electiveSub);
		System.out.println("Average Marks: "+avgMarks);
	}
	
	
		
}
		
		