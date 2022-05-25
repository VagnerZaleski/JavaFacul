package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) throws SQLException {

//		incluir();
//		apagar();
//		listar();
//		atualizar();

	}

	public static void incluir() throws SQLException {

		// 1 - Abrir conexão com o banco de dados
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Nova pasta\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);

		// 2 - Criar o comando e executar o SQL
		Statement comando = conexao.createStatement();
		String queryInsert = "insert into cliente (nome, dta_nasc, cpf, email)"
				+ "values('Ana', '2000/05/12', '987654321', 'ana@gmail.com')";

		comando.execute(queryInsert);

	}

	public static void listar() throws SQLException {

		// 1 - Abrir conexão com o banco de dados
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Nova pasta\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);

		// 2 - Criar o comando e executar o SQL
		Statement comando = conexao.createStatement();
		String querySelect = "select * from cliente";

		ResultSet resultado = comando.executeQuery(querySelect);

		// 3 - Mostrar os dados

		while (resultado.next()) {
			int codigo = resultado.getInt(1);
			String nome = resultado.getString(2);
			String dta_nasc = resultado.getString(3);
			String cpf = resultado.getString(4);
			String email = resultado.getString(5);

			System.out.println("Codigo: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("-----------");

		}
	}

	public static void atualizar() throws SQLException {

		// 1 - Abrir conexão com o banco de dados
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Nova pasta\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);

		// 2 - Criar o comando e executar o SQL
		Statement comando = conexao.createStatement();
		String queryUpdate = "update cliente set nome = 'Ana Maria'" + "where codigo = 2";

		comando.executeUpdate(queryUpdate);

	}

	public static void apagar() throws SQLException {

		// 1 - Abrir conexão com o banco de dados
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Nova pasta\\ExSQLite\\db\\primeiro_banco_de_dados.db";
		Connection conexao = DriverManager.getConnection(url);

		// 2 - Criar o comando e executar o SQL
		Statement comando = conexao.createStatement();
		String queryDelete = "delete from cliente where codigo = 4";

		comando.execute(queryDelete);

	}

}
