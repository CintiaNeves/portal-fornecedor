package negocio;

import dominio.Cadastro;
import dominio.Entidadedominio;

public class ValidaSenha implements IStrategy{

	@Override
	public String processar(Entidadedominio entidade) {
		Cadastro cadastro = (Cadastro) entidade;
		String senha = cadastro.getSenha();
		String confSenha = cadastro.getConfSenha();
		
		if(senha.length() < 6){
			//return "Senha deve conter pelo menos 6 caracteres";
			return null;
		}
		
		if(senha.equals(confSenha)){
			return null;
		}else{
			//return "Senha não confere";
			return null;
		}
		
	}

}
