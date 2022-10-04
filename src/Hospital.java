
public class Hospital 
{
	String hosName;
	int hosEstablished;
	Doctor doc;
	Hospital(){}
	
	Hospital(String n, int e, Doctor d)
	{
		super();
		hosName=n;
		hosEstablished=e;
		this.doc=d;
	}
	public void setHosName(String n)
	{
		hosName=n;
	}
	public void setHosEstablished(int e)
	{
		hosEstablished=e;
	}
	public void setDoc(Doctor d)
	{
		doc=d;
	}
	
	public String toString()
	{
		return "Name of hospital: \n"+hosName+ " \nIt was established in: \n"
				+hosEstablished+ " \n Hospital has a doctor:\n"+doc;
	}
	
	
}