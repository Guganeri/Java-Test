package entities;

public class Account {
	
	private static double TAX = 5.00;
	
	private int numeroUsuario;
	private String nomeUsuario;
	private double saldoUsuario;

	public Account(int numeroUsuario, String nomeUsuario) {
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
		this.saldoUsuario -= (valor+TAX);
	}
	
	public String toString() {
		return "Account "
				+ numeroUsuario
				+", Holder: "
				+ nomeUsuario
				+ ", Balancer: $ "
				+ String.format("%.2f", saldoUsuario);
	}
	
}
