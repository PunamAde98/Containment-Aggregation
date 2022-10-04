
public class Flat 
{
	int flatNo;
	String flatOwner;
	String flatArea; 
	
	Flat(){}

	Flat(int no,String owner, String area)
	{
		flatNo=no;
		flatOwner=owner;
		flatArea=area;
	}
	public String toString()
	{
		return "Flat no: \n " + flatNo + " \n Flat owners name: \n " + flatOwner + " \n Area of Flat: \n " + flatArea;
	}
}




