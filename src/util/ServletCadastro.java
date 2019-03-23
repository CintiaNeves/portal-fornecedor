package util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Cadastro;
import dominio.Login;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/cadastro" })

public class ServletCadastro extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		String s = request.getParameter("acao");
		if(request.getParameter("acao").equals("entrar")){

			Login login = new Login();
			login.setEmail(request.getParameter("email"));
			login.setSenha(request.getParameter("senha"));
			
			request.getRequestDispatcher("cotacoes.html").forward(request, response);
			
		}else if(request.getParameter("acao").equals("esqueciSenha")){
			
			request.getRequestDispatcher("teste.html").forward(request, response);
			
		}else if(request.getParameter("acao").equals("cadastrar")){
			
			request.getRequestDispatcher("teste.html").forward(request, response);
		}
		
		
		
		
	}
	

}
