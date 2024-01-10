package entities;

public class CadastroBanco {

	private int numeroUsuario;
	private String nomeUsuario;
	private double saldoUsuario;

	public CadastroBanco(int numeroUsuario, String nomeUsuario) {
		this.numeroUsuario = numeroUsuario;
		this.nomeUsuario = nomeUsuario;		
	}
	
	public int getNumeroUsuario() {
		return numeroUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public double getSaldoUsuario() {
		return saldoUsuario;
	}
	 
	public void depositoUsuario(double valor) {
		this.saldoUsuario += valor;
	}
	
	public void saqueUsuario(double valor) {
		this.saldoUsuario -= (valor+5.00);
	}
}
