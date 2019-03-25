package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dominio.Cadastro;
import dominio.Entidadedominio;
import util.ConnectionFactory;
import util.Resultado;

public class CadastroDAO extends AbstractDAO {
	
	
	public CadastroDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	@Override
	public Resultado salvar(Entidadedominio entidade) {
		Resultado resultado = new Resultado();
		Cadastro cadastro = (Cadastro) entidade; 
		String sql = "insert into cadastro (CAD_CNPJ, CAD_SENHA) values (?, ?)";
		try(PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cadastro.getCnpj());
			stmt.setString(2, cadastro.getSenha());
			stmt.execute();
			resultado.setSucesso("Cadastro realizado com sucesso.");
			resultado.setEntidade(cadastro);
		} catch(Exception e) {
			resultado.setErro("Não foi possivel realizar o cadastro.");
			e.printStackTrace();
		}
		destruct();
		return resultado;
	}

	@Override
	public Resultado consultar(Entidadedominio entidade) {
		Resultado resultado = new Resultado();
		Cadastro cadastro = (Cadastro) entidade; 
		String sql = "select * from cadastro where CAD_EMAIL = ?";
		try(PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cadastro.getEmail());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				cadastro.setId(rs.getInt("CAD_ID"));
				cadastro.setCodFornecedor(rs.getInt("CAD_CODIGO_FORNECE"));
				cadastro.setEmail(rs.getString("CAD_EMAIL"));
			}
			resultado.setSucesso("Cadastro encotrado com sucesso.");
			resultado.setEntidade(cadastro);
		} catch(Exception e) {
			resultado.setErro("Não foi possivel encotrar o cadastro.");
			e.printStackTrace();
		}
		destruct();
		return resultado;
	}

	@Override
	public Resultado alterar(Entidadedominio entidade) {
		Resultado resultado = new Resultado();
		Cadastro cadastro = (Cadastro) entidade; 
		String sql = "UPDATE CADASTRO SET CAD_CNPJ = ?, CAD_SENHA = ? WHERE CAD_ID = ?";
		try(PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, cadastro.getCnpj());
			stmt.setString(2, cadastro.getSenha());
			stmt.setLong(3, cadastro.getId());
			stmt.execute();
			resultado.setSucesso("Cadastro realizado com sucesso.");
			resultado.setEntidade(cadastro);
		} catch(Exception e) {
			resultado.setErro("Não foi possivel realizar o cadastro.");
			e.printStackTrace();
		}
		destruct();
		return resultado;
	}

	@Override
	public Resultado excluir(Entidadedominio entidade) {

		destruct();
		return null;
	}

}
