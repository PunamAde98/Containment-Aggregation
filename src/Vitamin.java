
public class Vitamin 
{
	String vitName;
	int praportion;
	String use; 
	
	Vitamin(){}

	Vitamin(String name,int prop,String u)
	{
		vitName=name;
		praportion=prop;
		use=u;
	}
	public String toString()
	{
		return "Vitamin name: \n " + vitName + " \n praportion of vitamin: \n" + praportion + " \n Use of vitamin to body is: \n " + use;
	}
}
