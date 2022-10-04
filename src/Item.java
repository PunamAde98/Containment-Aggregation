
public class Item 
{
	   private int id;
	   private int quantity;
	   private int price; 
	   private String name;
	   private Bill itemBill; 
	   private Supplier sup;
	   
	    public int getId()
	    {
	    	return id;
	    }
	    public int getQuantity()
	    {
	    	return quantity;
	    }
	    public int getPrice()
	    {
	    	return price;
	    }
	    public String getName()
	    {
	    	return name;
	    }
	    
	    public void setId(int id)
	    {
	    	this.id = id;
	    }
	    public void setQuantity(int q)
	    {
	    	quantity = q;
	    }
	    public void setPrice(int p)
	    {
	    	price = p;
	    }
	    public void setitemBill(Bill b)
	    {
	    	itemBill = b;
	    }
	    public void setSup(Supplier s)
	    {
	    	sup = s;
	    }
	    public void setName(String n)
	    {
	    	name = n;
	    }
	   
	    public String toString()
	    {
	    	return "Item ID:"+id+ " \n Item Quantity:"
	    			+quantity+ "\n Item Price:"+price+ " \n Item Name:"
	    			+name+ " \n has its Item Bill: \n"+itemBill+ 
	    			" \n and also has its Supplier: \n" +sup;
	    }

}



