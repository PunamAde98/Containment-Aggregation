
public class HosBill {

	public static void main(String[] args) 
	{
		MyDate d1= new MyDate();
		d1.setDate(12);
		d1.setMonth("March");
		d1.setYear(1997);
		
		Bill b = new Bill();
		b.setBillDate(d1);
		b.setBillAmount(700.0f);
		b.setBillNo(6);
		
		Supplier s=new Supplier();
		s.setSupId(90);
	    s.setSupName("Priya");
		s.setSupMobile(67543);
		
		Item i = new Item();
	    i.setId(80);
	    i.setName("Watch");
	    i.setPrice(2000);
	    i.setQuantity(1);
	    i.setitemBill(b);
	    i.setSup(s);
		  
	    System.out.println(i);
		
		

	}

}
