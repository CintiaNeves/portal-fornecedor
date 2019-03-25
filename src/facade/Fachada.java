package facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.CadastroDAO;
import dao.IDAO;
import dominio.Entidadedominio;
import negocio.CompDataCadastro;
import negocio.IStrategy;
import negocio.ValidaSenha;
import util.Resultado;

public class Fachada implements IFachada {

	private Map<String, List<IStrategy>> mapStrategy;
	private Map<String, IDAO> mapDAO;
	private List<IStrategy> listStrategyAlterar;

	public Fachada() {

		mapStrategy = new HashMap<String, List<IStrategy>>();
		mapDAO = new HashMap<String, IDAO>();
		listStrategyAlterar = new ArrayList<IStrategy>();
		listStrategyAlterar.add(new CompDataCadastro());
		listStrategyAlterar.add(new ValidaSenha());
		mapStrategy.put("ALTERAR", listStrategyAlterar);
		mapDAO.put("CADASTRO", new CadastroDAO());

	}

	public Resultado validaStrategy(Entidadedominio entidade, String operacao) {

		Resultado resultado = new Resultado();
		String mensagem = "";
		String mensagens = "";
		
		List<IStrategy> listStrategy;
		listStrategy = mapStrategy.get(operacao);
		
		for (IStrategy iStrategy : listStrategy) {
			
			mensagem = iStrategy.processar(entidade);
			if(mensagem != null){
				mensagens += mensagem;
			}
		}
		if(mensagens != ""){
			List<Entidadedominio> l = new ArrayList<>();
			l.add(entidade);
			resultado.setListaEntidade((l));
			resultado.setErro(mensagens);
		}
		
		return resultado;
	}

	@Override
	public Resultado salvar(Entidadedominio entidade) {

		Resultado resultado = new Resultado();
		resultado = validaStrategy(entidade, "SALVAR");

		if (!resultado.isErro()) {
			IDAO dao = mapDAO.get(entidade.getClass().getSimpleName().toUpperCase());
			return dao.salvar(entidade);
		}
		return resultado;

	}

	@Override
	public Resultado consultar(Entidadedominio e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultado alterar(Entidadedominio entidade) {
		Resultado resultado = new Resultado();
		resultado = validaStrategy(entidade, "ALTERAR");

		if (!resultado.isErro()) {
			IDAO dao = mapDAO.get(entidade.getClass().getSimpleName().toUpperCase());
			return dao.alterar(entidade);
		}
		return resultado;
	}

}
