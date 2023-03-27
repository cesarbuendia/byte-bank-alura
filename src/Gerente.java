
public class Gerente extends Funcionario {

	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarsesion(String clave) {
		return clave == "AluraCursosOnline";
		
	}
	
}
