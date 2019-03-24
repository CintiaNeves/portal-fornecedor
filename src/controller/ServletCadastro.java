package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Cadastro;
import dominio.Login;
import util.ConnectionFactory;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/cadastro" })

public class ServletCadastro extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		try(Connection conection = new ConnectionFactory().getConnection()) {
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	

}
