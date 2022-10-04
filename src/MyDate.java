
public class MyDate 
{
	private String month;
	private int year;
	private int date;
	
	public void setMonth(String mm)
	{
		month=mm;
	}
	public void setYear(int yy)
	{
		year=yy;
	}
	public void setDate(int dd)
	{
		date=dd;
	}

	public String toString()
	{
		return "Month:" +month+ " \n Year:"+year+ 
				" \n Date:"+ date;
	}
}
