package dao;

import dominio.Entidadedominio;
import util.ConnectionFactory;

public class DAOCadastro extends AbstractDAO {
	
	public DAOCadastro() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	@Override
	public String salvar(Entidadedominio entidade) {

		destruct();
		return null;
	}

	@Override
	public String consultar(Entidadedominio entidade) {
		
		destruct();
		return null;
	}

	@Override
	public String alterar(Entidadedominio entidade) {

		destruct();
		return null;
	}

	@Override
	public String excluir(Entidadedominio entidade) {

		destruct();
		return null;
	}

}
