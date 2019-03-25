package facade;

import dominio.Entidadedominio;
import util.Resultado;

public interface IFachada {

	public Resultado salvar(Entidadedominio e);

	public Resultado consultar(Entidadedominio e);

	public Resultado alterar(Entidadedominio e);
}
