package dominio;

import java.util.Calendar;
import java.util.List;

public class Cotacao {
	
	private boolean status;
	private String empresa;
	private int numeroCotacao;
	private int solicitacaoCompra;
	private int codFornecedor;
	private String nomeFornecedor;
	private String comprador;
	private Calendar dataEmissao;
	private Calendar dataLimite;
	private Calendar validade;
	private Frete frete;
	private CondPagamento condPagamento;
	private String endEntrega;
	private List<ItemCotacao>itens;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getNumeroCotacao() {
		return numeroCotacao;
	}
	public void setNumeroCotacao(int numeroCotacao) {
		this.numeroCotacao = numeroCotacao;
	}
	public int getSolicitacaoCompra() {
		return solicitacaoCompra;
	}
	public void setSolicitacaoCompra(int solicitacaoCompra) {
		this.solicitacaoCompra = solicitacaoCompra;
	}
	public int getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getComprador() {
		return comprador;
	}
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Calendar getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Calendar dataLimite) {
		this.dataLimite = dataLimite;
	}
	public Calendar getValidade() {
		return validade;
	}
	public void setValidade(Calendar validade) {
		this.validade = validade;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	public CondPagamento getCondPagamento() {
		return condPagamento;
	}
	public void setCondPagamento(CondPagamento condPagamento) {
		this.condPagamento = condPagamento;
	}
	public String getEndEntrega() {
		return endEntrega;
	}
	public void setEndEntrega(String endEntrega) {
		this.endEntrega = endEntrega;
	}
	public List<ItemCotacao> getItens() {
		return itens;
	}
	public void setItens(List<ItemCotacao> itens) {
		this.itens = itens;
	}
	


	
	
	
	
	
}
