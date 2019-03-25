package dominio;


public class ItemCotacao extends Entidadedominio{
	
	private int numeroItem;
	private int codProduto;
	private String descricaoProduto;
	private String um;
	private double quantidade;
	private double valorUnitario;
	private double ipi;
	private double icms;
	private double valorFrete;
	private double valorTotal;
	private int prazoEntrega;
	private String obeservacao;
	
	public int getNumeroItem() {
		return numeroItem;
	}
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public String getUm() {
		return um;
	}
	public void setUm(String um) {
		this.um = um;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getIpi() {
		return ipi;
	}
	public void setIpi(double ipi) {
		this.ipi = ipi;
	}
	public double getIcms() {
		return icms;
	}
	public void setIcms(double icms) {
		this.icms = icms;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public String getObeservacao() {
		return obeservacao;
	}
	public void setObeservacao(String obeservacao) {
		this.obeservacao = obeservacao;
	}
	
	
	
	
	
	
	
}
