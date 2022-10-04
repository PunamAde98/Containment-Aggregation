
public class Fruit 
{
	String fName;
	int fQuantity;
	String fColour;
	Vitamin v;
	Fruit(){}
	
	Fruit(String n, int q, String c,Vitamin v)
	{
		super();
		fName=n;
		fQuantity=q;
		fColour=c;
		this.v=v;
	}
	public String toString()
	{
		return "Fruit name\n "+fName+"\n has its Quantity\n"+fQuantity+"\nhas its colour\n"+fColour+
				                              "\n It has Vitamin \n"+v;
	}

}
