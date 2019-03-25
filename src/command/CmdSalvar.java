package command;

import dominio.Entidadedominio;
import util.Resultado;

public class CmdSalvar extends AbstractCommand{

	@Override
	public Resultado executar(Entidadedominio entidade) {
		// TODO Auto-generated method stub
		return fachada.salvar(entidade);
	}

	
}
