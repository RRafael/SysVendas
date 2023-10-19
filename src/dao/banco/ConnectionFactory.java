// situa em qual package ou “pacote” está a classe
package dao.banco;
// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/loja","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}