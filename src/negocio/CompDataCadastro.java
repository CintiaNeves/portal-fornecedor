package negocio;


import dominio.Cadastro;
import dominio.Entidadedominio;

public class CompDataCadastro implements IStrategy{

	@Override
	public String processar(Entidadedominio entidade) {
		
		Cadastro cadastro = (Cadastro) entidade;
		return null;
	}

}