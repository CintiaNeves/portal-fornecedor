package viewhelper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Cadastro;
import dominio.Entidadedominio;
import util.Resultado;

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
		
		
		
		return cadastro;
	}

	/**
	 * Este método serve para validar as informações recebidas do banco de dados após a consulta,
	 * Aqui deve-se validar se o que o era necessário apresentar para o usuário está presente,
	 * Caso as informações não estejam presentes deve-se criar uma variavel de erro com 
	 * mensagem para exibir na tela para o usuário antes de retonar para a controller.
	 */
	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) {
		
 		String operacao = request.getParameter("btnOperacao");
		String mensagem[] = resultado.getMensagem().split("\n");
		try {
			if (resultado.isErro()) {
				request.setAttribute("erro", mensagem);
				request.getRequestDispatcher("cadastro.jsp").forward(request, response);
			} else {
				request.setAttribute("jose", "wesley");
				request.getRequestDispatcher("cotacoes.jsp").forward(request, response);
			}
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
