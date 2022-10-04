
public class Doctor 
{
	private int regNo;
	private String docName;
	private String specialist;
	private int experience;
	
	public Doctor() {}
	
	public Doctor(int no,String n,String s,int e)
	{
		regNo=no;
		docName=n;
		specialist=s;
		experience=e;
	}
	
	public void setRegNo(int no)
	{
		regNo=no;
	}
	public void setDocName(String name)
	{
		docName=name;
	}
	public void setSpecialist(String s)
	{
		specialist=s;
	}
	public void setExperience(int e)
	{
		experience=e;
	}
    public String toString()
    {
    	return "Registration no:\n"+regNo+ " \n Name of doctor:\n"+docName+
    			" \n he is specialist in: \n"+specialist+ 
    			" \n his experience as a specialist in years \n" +experience;
    }
}
