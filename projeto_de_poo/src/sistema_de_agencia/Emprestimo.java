package sistema_de_agencia;

public class Emprestimo {
	
	private String idCliente;
	private String idEmprestimo;
	private String quantiaParcela;
	private String valorEmprestimo;
	
	
	
	


	public Emprestimo(String idCliente, String idEmprestimo, String quantiaParcela, String valorEmprestimo) {
		super();
		this.idCliente = idCliente;
		this.idEmprestimo = idEmprestimo;
		this.quantiaParcela = quantiaParcela;
		this.valorEmprestimo = valorEmprestimo;
	}
	
	@Override
	public String toString() {
		return "Emprestimo [idCliente=" + idCliente + ", idEmprestimo=" + idEmprestimo + ", quantiaParcela="
				+ quantiaParcela + ", valorEmprestimo=" + valorEmprestimo + "]";
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(String idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public String getQuantiaParcela() {
		return quantiaParcela;
	}
	public void setQuantiaParcela(String quantiaParcela) {
		this.quantiaParcela = quantiaParcela;
	}
	public String getValorEmprestimo() {
		return valorEmprestimo;
	}
	public void setValorEmprestimo(String valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}