package dominio;

import java.util.Calendar;

public class ItemCotacao {

	private Produto produto;
	private int numero;
	private double quantidade;
	private Calendar dataEntrega;
	private double ipi;
	private double icms;
	private double valorTotal;
	private double valorUnitario;
	
	public double getIcms() {
		return icms;
	}
	public void setIcms(double icms) {
		this.icms = icms;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public Calendar getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public double getIpi() {
		return ipi;
	}
	public void setIpi(double ipi) {
		this.ipi = ipi;
	}
	
	
}
