
public class testGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente()	;
		//gerente.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnline");
		gerente.setTipo(1);
		
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarsesion("AluraCursosOnline"));
		
		
	}
}
