
public class testFuncionario {
	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		
		diego.setNombre("Diego");
		diego.setDocumento("asdf23d");
		diego.setSalario(2000);		
		
		diego.setTipo(0);
		System.out.println(diego.getSalario());
	
	
		System.out.println(diego.getBonificacion());
		
		
	}
	

}
