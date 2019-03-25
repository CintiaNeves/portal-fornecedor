package negocio;

import dominio.Entidadedominio;

public interface IStrategy {
	
	public String processar(Entidadedominio entidade);
}
