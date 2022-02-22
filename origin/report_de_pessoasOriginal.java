import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class report_de_pessoasOriginal {
	/**
	 * a string para somar todos os nomes na lista 
	 */
	static String _s;
	
	/**
	 * imprime a lista de pessoas
	 * @param paramL
	 */
	public static void print_e_vai(Vector paramL){
		
		for (int i = 0; i < paramL.size(); i++) {
			
			Pessoa p = (Pessoa) paramL.get(i);
			ValidationHadukenOriginal validador = new ValidationHadukenOriginal();
			List<String> erro = validador.validaPessoa(p);
			
			if(!erro.isEmpty())
				continue;
			
		    _s += ", " + p.name;			
		}
		//remove a coisa feia! Dúvidas? Fudeu ...
		_s = _s.substring(2); 
		System.out.print(_s);
	}
	
	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		Vector v = new Vector();
		
		Pessoa p = new Pessoa();
		p.name = "Guilherme";
		p.cpf = "0023334467";
		ArrayList<String> danielTelefonesFixos = new ArrayList<String>();
		danielTelefonesFixos.add("8765343");
		p.telefonesCelulares = danielTelefonesFixos;
		v.add(p);
		
		print_e_vai(v);
		
	}

}

 class Pessoa{
	String name;
	String cpf;
	int idade;
	List<String> telefonesFixos;
	List<String> telefonesCelulares;
}