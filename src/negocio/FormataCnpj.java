package negocio;

import dominio.Cadastro;
import dominio.Entidadedominio;

public class FormataCnpj implements IStrategy{

	@Override
	public String processar(Entidadedominio entidade) {
		
		Cadastro cadastro = (Cadastro) entidade;
		
		String cnpj = cadastro.getCnpj();
		cnpj = cnpj.replace(".", "");
		cnpj = cnpj.replace("/", "");
		cnpj = cnpj.replace("-", "");
		cadastro.setCnpj(cnpj);
		return null;
	}
}
