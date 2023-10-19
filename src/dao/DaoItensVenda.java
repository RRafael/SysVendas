package dao;

import dao.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ItensVenda;
import model.Produto;
import model.Venda;

public class DaoItensVenda {

    private Connection connection = null;

    public void adicionaItemVenda(ItensVenda itens) {

        String sql = "INSERT INTO tab_itens_venda"
                + "(id_produto_estoque,id_vendas,quantidade,valor_unitario,valor_total) "
                + "VALUES(?,?,?,?,?)";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, itens.getIdProdutoEstoque());
            stmt.setInt(2, itens.getIdVendas());
            stmt.setInt(3, itens.getQuantidade());
            stmt.setFloat(4, itens.getValorUnitario());
            stmt.setFloat(5, itens.getValorTotal());
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

    public ArrayList<Produto> itensVendidosPorPeriodo(String dataInicial, String dataFinal) {

        ResultSet resultado = null;
        Produto produto;
        ArrayList<Produto> listaDeItens = new ArrayList();

        String sql = "SELECT tab_produto_estoque.codigo, tab_produto_estoque.nome, SUM(tab_itens_venda.quantidade) AS quantidade "
                + " FROM tab_itens_venda"
                + " INNER JOIN tab_produto_estoque ON tab_itens_venda.id_produto_estoque = tab_produto_estoque.id"
                + " INNER JOIN tab_vendas ON tab_itens_venda.id_vendas = tab_vendas.id"
                + " WHERE data_venda BETWEEN ? AND ? GROUP BY tab_itens_venda.id_produto_estoque";

        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, dataInicial);
            stmt.setString(2, dataFinal);
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                produto = new Produto();
                produto.setCodigo(resultado.getInt("codigo"));
                produto.setNome(resultado.getString("nome"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                listaDeItens.add(produto);
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
        return listaDeItens;
    }

}
