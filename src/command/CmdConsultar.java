package command;

import dominio.Entidadedominio;
import util.Resultado;

public class CmdConsultar extends AbstractCommand{

	@Override
	public Resultado executar(Entidadedominio e) {
		// TODO Auto-generated method stub
		return fachada.consultar(e);
	}

}
