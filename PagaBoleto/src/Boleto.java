public class Boleto {

	private String codigo;
	private String data;
	private double valorPago;
	
	public Boleto(String c, String d, double v) {
		this.codigo = c;
		this.data = d;
		this.valorPago = v;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
}
