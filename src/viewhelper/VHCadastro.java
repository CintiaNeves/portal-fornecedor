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
	 * Este m�todo serve para validar as informa��es recebidas do banco de dados ap�s a consulta,
	 * Aqui deve-se validar se o que o era necess�rio apresentar para o usu�rio est� presente,
	 * Caso as informa��es n�o estejam presentes deve-se criar uma variavel de erro com 
	 * mensagem para exibir na tela para o usu�rio antes de retonar para a controller.
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
