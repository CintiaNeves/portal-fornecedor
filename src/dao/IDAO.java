package dao;

import dominio.Entidadedominio;
import util.Resultado;

public interface IDAO {
	
	public Resultado salvar(Entidadedominio entidade);
	public Resultado consultar (Entidadedominio entidade);
	public Resultado alterar (Entidadedominio entidade);
	public Resultado excluir (Entidadedominio entidade);
	
}
