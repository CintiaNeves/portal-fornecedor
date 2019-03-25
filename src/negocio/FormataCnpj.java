package negocio;

import dominio.Cadastro;
import dominio.Entidadedominio;

public class FormataCnpj implements IStrategy{

	@Override
	public String processar(Entidadedominio entidade) {
		
		Cadastro cadastro = (Cadastro) entidade;
		
		if((cadastro.getCnpj() != null) || (cadastro.getCnpj().equals(""))) {
			
			String cnpj = cadastro.getCnpj();
			
			StringBuilder sqlCnpj = new StringBuilder();
			sqlCnpj.append(cnpj.charAt(0));
			sqlCnpj.append(cnpj.charAt(1));
			sqlCnpj.append(cnpj.charAt(3));
			sqlCnpj.append(cnpj.charAt(4));
			sqlCnpj.append(cnpj.charAt(5));
			sqlCnpj.append(cnpj.charAt(7));
			sqlCnpj.append(cnpj.charAt(8));
			sqlCnpj.append(cnpj.charAt(9));
			sqlCnpj.append(cnpj.charAt(11));
			sqlCnpj.append(cnpj.charAt(12));
			sqlCnpj.append(cnpj.charAt(13));
			sqlCnpj.append(cnpj.charAt(14));
			sqlCnpj.append(cnpj.charAt(16));
			sqlCnpj.append(cnpj.charAt(17));
			
			cnpj = sqlCnpj.toString();
			cadastro.setCnpj(cnpj);
			return null;
		}
		else {
			return "CNPJ vazio";
		}
	}

}
