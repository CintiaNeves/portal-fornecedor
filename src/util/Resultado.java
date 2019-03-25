package util;

import java.util.List;

import dominio.Entidadedominio;

public class Resultado {
	
	private List<Entidadedominio> listaEntidade;
	private Entidadedominio entidade;
	private boolean erro;
	private String mensagem;
	
	public void setErro(String mensagem) {
		erro = true;
		this.mensagem = mensagem;
	}

	public void setSucesso(String mensagem) {
		erro = false;
		this.mensagem = mensagem;
	}
	
	public boolean isErro() {
		return erro;
	}
	public String getMensagem() {
		return mensagem;
	}
	public Entidadedominio getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidadedominio entidade) {
		this.entidade = entidade;
	}
	public List<Entidadedominio> getListaEntidade() {
		return listaEntidade;
	}
	public void setListaEntidade(List<Entidadedominio> listaEntidade) {
		this.listaEntidade = listaEntidade;
	}
	
	
}
