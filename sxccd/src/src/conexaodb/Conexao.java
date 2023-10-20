package src.conexaodb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static final String url = "jdbc:mysql://localhost:3306/livros_bd";
	private static final String user = "root";
	private static final String password = "";
	
	private static Connection conn;


	public static Connection getConexao() {
		// TODO Auto-generated method stub
		try {
			
			if(conn == null) {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("CONEXÃO COM O BANCO DE DADOS REALIZADA\n");
			return conn;
			
			}else {
				return conn;
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
			
			System.out.println("FALHA NA CONEXÃO COM O BANCO DE DADOS\n");
			return null;
		}
		
	}
}
