abstract public class Hostel
{
	protected String hostelName;
	protected String hostelLocation;
	protected int numOfRooms;
	
	public Hostel(String hostelName,String hostelLocation,int numOfRooms )
	{
		this.hostelName=hostelName;
		this.hostelLocation=hostelLocation;
		this.numOfRooms=numOfRooms;
	}
	abstract void print();
	}
	