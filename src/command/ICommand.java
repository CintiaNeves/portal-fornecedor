package command;

import dominio.Entidadedominio;
import util.Resultado;

public interface ICommand {

	public Resultado executar(Entidadedominio entidade);
}
