package dominio;

public class Cadastro extends Entidadedominio{

	private String cnpj;
	private String email;
	private String senha;
	private String confSenha;
	private int codFornecedor;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfSenha() {
		return confSenha;
	}
	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}
	public int getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	
	
	
}
