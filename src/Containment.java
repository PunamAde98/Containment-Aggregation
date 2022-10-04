
public class Containment {

	public static void main(String[] args) 
	{
		Vitamin v=new Vitamin("V", 10,"Its good for our health");
		Fruit f=new Fruit("Apple", 8, "Red",v);
		System.out.println(f);

	}

}
