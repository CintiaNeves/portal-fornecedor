package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CmdAlterar;
import command.CmdConsultar;
import command.CmdSalvar;
import command.ICommand;
import dao.CadastroDAO;
import dominio.Entidadedominio;
import util.Resultado;
import viewhelper.IViewHelper;
import viewhelper.VHCadastro;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/cadastro" })

public class ServletCadastro extends HttpServlet {

	private Map<String, ICommand> mapCommand;

	public ServletCadastro() {

		mapCommand = new HashMap<String, ICommand>();

		mapCommand.put("CONSULTAR", new CmdConsultar());
		mapCommand.put("ALTERAR", new CmdAlterar());
		mapCommand.put("SALVAR", new CmdSalvar());

	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String operacao = request.getParameter("acao");
		IViewHelper viewHelper = new VHCadastro();
		Entidadedominio entidade = viewHelper.getEntidade(request);

		if ("SALVAR".equals(operacao)) {
			CadastroDAO cadastroDAO = new CadastroDAO();
			Resultado r = cadastroDAO.consultar(entidade);
			if (!r.isErro()) {
				entidade = r.getEntidade();
				operacao = "ALTERAR";
			}
		}

		ICommand command = mapCommand.get(operacao);
		Resultado resultado = command.executar(entidade);
		
		/**
		 * chama vh e insere os dados na resposta,
		 * valida erro
		 */
		viewHelper.setView(resultado, request, response);
	}
}
