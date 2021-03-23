package sistema_de_agencia;

import java.sql.Date;

public class Transacao {
	private String numeroConta;
	private String numeroTransacao;
	private String quantia;
	private String data;
	private String nomeTransacao;
	
	
	
	

	
	public Transacao(String numeroConta, String numeroTransacao, String quantia, String data, String nomeTransacao) {
		super();
		this.numeroConta = numeroConta;
		this.numeroTransacao = numeroTransacao;
		this.quantia = quantia;
		this.data = data;
		this.nomeTransacao = nomeTransacao;
	}
	@Override
	public String toString() {
		return "Transacao [numeroConta=" + numeroConta + ", numeroTransacao=" + numeroTransacao + ", quantia=" + quantia
				+ ", data=" + data + ", nomeTransacao=" + nomeTransacao + "]";
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNumeroTransacao() {
		return numeroTransacao;
	}
	public void setNumeroTransacao(String numeroTransacao) {
		this.numeroTransacao = numeroTransacao;
	}
	public String getQuantia() {
		return quantia;
	}
	public void setQuantia(String quantia) {
		this.quantia = quantia;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNomeTransacao() {
		return nomeTransacao;
	}
	public void setNomeTransacao(String nomeTransacao) {
		this.nomeTransacao = nomeTransacao;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
