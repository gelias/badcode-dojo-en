package cc.code;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class people_reportTest {
	
	@Test
	public void shouldConcatenatePeople() {
		people_report report = new people_report();
		
		Person p = new Person();
		p.name = "Juarez";
		String _s = null;
		_s = people_report.concatenatePersonName(p, _s);
		
		assertEquals("Juarez", _s);
	}
	
	@Test
	public void shouldPrintConcatenatedNames() {
		
	}
	
	@Test
	public void deveConcatenarMaisDeUmaPessoa() {
		people_report report = new people_report();

		String _s = null;
		
		Person p = new Person();
		p.name = "Juarez";
		_s = report.concatenatePersonName(p, null);		
		
		Person p2 = new Person();
		p2.name = "Balboa";
		_s = report.concatenatePersonName(p2, _s);
		
		assertEquals("Juarez, Balboa", _s);
	}
}
