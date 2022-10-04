
public class Supplier 
{
	private int supId;
	private String supName;
	private int supMobile;
	
	public void setSupId(int i)
	{
		supId=i;
	}
	public void setSupName(String n)
	{
		supName=n;
	}
	public void setSupMobile(int m)
	{
		supMobile=m;
	}

	public String toString()
	{
		return " Supplier ID:"+supId+ " \n Supplier Name:"+supName+
				" \n Supplier Mobile:"+supMobile;
	}
}
