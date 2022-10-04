
public class Bill 
{
	private int billNo;
	private float billAmount;
	private MyDate billDate;
	
	public void setBillNo(int n)
	{
		billNo=n;
	}
	public void setBillAmount(float b)
	{
		billAmount=b;
	}
	public void setBillDate(MyDate d)
	{
		billDate=d;
	}
	
	public String toString()
	{
		return "Bill Number: "+billNo+ " \n has its Bill Amount:"
				+billAmount+ " \n has its Bill Date:"+billDate;
	}

}
