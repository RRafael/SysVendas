package dao;

import dao.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Produto;
import model.Venda;

public class DaoVenda {

    private Connection connection = null;

    public void adiciona(Venda venda) {

        String sql = "INSERT INTO tab_vendas(total,data_venda) VALUES(?,NOW())";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setFloat(1, venda.getTotal());
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        } finally {
            try {
                if (this.connection != null) {
                    this.connection.close(); //fecha a conecao com o banco de dados                               
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("erro ao fechar a conexão");
            }
        }
    }

    public int buscar() {

        ResultSet resultado = null;
        int utimoIdVenda = 0;

        String sql = "Select Max(id) as idVendas from tab_vendas";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                utimoIdVenda = resultado.getInt("idVendas");
            }

            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        } finally {
            try {
                if (this.connection != null) {
                    this.connection.close(); //fecha a conecao com o banco de dados                               
                }
                if (resultado != null) {
                    resultado.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("erro ao fechar a conexão");
            }
        }
        return utimoIdVenda;
    }

    public float TotalVendasPeriodo(String dataInicial, String dataFinal) {

        ResultSet resultado = null;
        float total = 0;
 
        String sql = "SELECT sum(total) as total FROM tab_vendas WHERE data_venda BETWEEN ? AND ?";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, dataInicial);
            stmt.setString(2, dataFinal);
            resultado = stmt.executeQuery();
            resultado.next();
            total = resultado.getFloat("total");
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        } finally {
            try {
                if (this.connection != null) {
                    this.connection.close(); //fecha a conecao com o banco de dados                               
                }
                if (resultado != null) {
                    resultado.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("erro ao fechar a conexão");
            }
        }
        return total;
    }
}
