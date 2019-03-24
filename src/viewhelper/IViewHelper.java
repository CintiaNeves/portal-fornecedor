package viewhelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Entidadedominio;


public interface IViewHelper {

	public Entidadedominio getEntidade(HttpServletRequest request);
	
	public void setView(String resultado, HttpServletRequest request, HttpServletResponse response);
	
}
