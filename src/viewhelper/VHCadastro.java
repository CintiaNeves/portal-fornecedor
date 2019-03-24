package viewhelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Cadastro;
import dominio.Entidadedominio;

public class VHCadastro implements IViewHelper {

	@Override
	public Entidadedominio getEntidade(HttpServletRequest request) {
		
		String stCnpj = request.getParameter("cnpj");
		String stEmail = request.getParameter("email");
		String stSenha = request.getParameter("senha");
		String stConfirmaSenha = request.getParameter("confirmaSenha");
		
		Cadastro cadastro = new Cadastro();
		cadastro.setCnpj(stCnpj);
		cadastro.setEmail(stEmail);
		cadastro.setSenha(stSenha);
		cadastro.setConfSenha(stConfirmaSenha);
		
		
		
		return null;
	}

	@Override
	public void setView(String resultado, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	
}
