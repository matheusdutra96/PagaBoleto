import java.util.ArrayList;

public class Fatura {

	private String nomeCliente;
	private String data;
	private double valorTotal;
	
	public 	Fatura(String nome, String data, double valorTotal) {
		this.nomeCliente = nome;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	
	public boolean pagaFatura(ArrayList<Boleto> boletos) {
		double valorBoletos = 0;
		for(int i = 0; i < boletos.size(); i++) {
			valorBoletos = valorBoletos + boletos.get(i).getValorPago();
		}
		
		if(valorBoletos >= this.valorTotal) {
			return true;
		}
		return false;
	}
}
