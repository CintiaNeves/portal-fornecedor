package dao;

import dominio.Entidadedominio;

public interface IDAO {
	
	public String salvar(Entidadedominio entidade);
	public String consultar (Entidadedominio entidade);
	public String alterar (Entidadedominio entidade);
	public String excluir (Entidadedominio entidade);
	
}
