
public class HosDoc 
{

	public static void main(String[] args) 
	{
		Doctor d = new Doctor();
		
		d.setDocName("Dr.Sham");
		d.setRegNo(5678);
		d.setExperience(5);
		d.setSpecialist("Surgeon");
		
		Hospital h = new Hospital();
	    h.setHosName("Lotus Hospital");
	    h.setHosEstablished(1998);
	    h.setDoc(d);
	   
		System.out.println(h);
	}

}
