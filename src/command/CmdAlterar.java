package command;

import dominio.Entidadedominio;
import util.Resultado;

public class CmdAlterar extends AbstractCommand {
	@Override
	public Resultado executar(Entidadedominio entidade) {
		// TODO Auto-generated method stub
		return fachada.alterar(entidade);
	}

	
}
