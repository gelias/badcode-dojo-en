package cc.code;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * People Report
 * @author God
 */
public class people_report {
	/**
	 * The string to sum all names in the list 
	 */
	static String _s;
	
	public people_report() {
		_s = null;
	}
	
	/**
	 * Print list of people
	 * @param paramL
	 */
	public static void print_and_go(Vector paramL){
		
		for (int i = 0; i < paramL.size(); i++) {
			
			Person p = (Person) paramL.get(i);
			HadukenValidation validator = new HadukenValidation();
			List<String> errors = validator.validatePerson(p);
			
			if(!errors.isEmpty())
				continue;
			
			_s = concatenatePersonName(p, null);
		}
		System.out.print(_s);
	}
	

	public static String concatenatePersonName(Person p, String listName) {
		if(listName == null)
			listName = p.name;
		else			
			listName += ", " + p.name;
		return listName;
	}
	
	/**
	 * The God's main code
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		
		Person p = new Person();
		p.name = "Bill";
		p.cpf = "0023334467";
		ArrayList<String> billHardPhones = new ArrayList<String>();
		billHardPhones.add("8765343");
		p.mobilePhones = billHardPhones;
		
		Person p2 = new Person();
		p2.name = "John";
		p2.cpf = "123123123";
		ArrayList<String> johnHardPhones = new ArrayList<String>();
		johnHardPhones.add("98765135");
		p2.mobilePhones = johnHardPhones;
		v.add(p2);
		
		print_and_go(v);
		
	}

}

 class Person{
	String name;
	String cpf;
	int idade;
	List<String> hardPhones;
	List<String> mobilePhones;
}