
public class Building 
{
	String bName;
	int noOfFloors;
	Flat f;
	public Building() {}
	
	public Building(String n,int no,Flat f)
	{
		super();
		bName=n;
		noOfFloors=no;
		this.f=f;
	}
	public String toString()
	{
		return "Building Name:\n" +bName+ "\nhas its no of floors:\n"
				+noOfFloors+ "\n And building has a flat:\n" +f;
	}
}


