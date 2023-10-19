package dao;

import java.sql.*;
import java.sql.PreparedStatement;
import dao.banco.ConnectionFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ItensVenda;
import model.Produto;

public class DaoProdutosEstoque {

    private Connection connection = null;

    public void adicionaProdutoEstoque(Produto produto) {

        String sql = "INSERT INTO tab_produto_estoque"
                + "(codigo,nome,quantidade,valor,data_cadastro) "
                + "VALUES(?,?,?,?,NOW())";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, produto.getCodigo());
            stmt.setString(2, produto.getNome());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setFloat(4, produto.getValor());
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

    public void atualizaProdutoEstoque(Produto produto) {

        String sql = "UPDATE tab_produto_estoque "
                + "SET nome = ?, quantidade = quantidade + ?, valor = ? WHERE  codigo = ?;";

        try {
            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setFloat(3, produto.getValor());
            stmt.setInt(4, produto.getCodigo());
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

    public Produto buscarProdutoEstoque(int codigo) {

        ResultSet resultado = null;
        Produto produto = new Produto();
        String sql = "SELECT * FROM tab_produto_estoque";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            resultado = stmt.executeQuery();

            while (resultado.next()) {

                if (resultado.getInt("codigo") == codigo) {
                    produto.setId(resultado.getInt("id"));
                    produto.setCodigo(resultado.getInt("codigo"));
                    produto.setNome(resultado.getString("nome"));
                    produto.setQuantidade(resultado.getInt("quantidade"));
                    produto.setValor(resultado.getFloat("valor"));
                }
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
        return produto;
    }

    public ArrayList<Produto> buscarProdutoEstoquePorNome(String nomeProduto) {

        ResultSet resultado = null;
        Produto produto;
        ArrayList<Produto> listaDeProdutos = new ArrayList();

        String sql = "SELECT * FROM tab_produto_estoque WHERE nome LIKE '%" + nomeProduto + "%'";
        try {

            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                produto = new Produto();
                produto.setCodigo(resultado.getInt("codigo"));
                produto.setNome(resultado.getString("nome"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setValor(resultado.getFloat("valor"));
                listaDeProdutos.add(produto);
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
        return listaDeProdutos;
    }

    public void atualizarEstoque(ItensVenda item) {

        String sql = "UPDATE tab_produto_estoque "
                + "SET quantidade = quantidade - ? WHERE  id = ?;";

        try {
            this.connection = new ConnectionFactory().getConnection(); //conecta com o banco de dados
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, item.getQuantidade());
            stmt.setInt(2, item.getIdProdutoEstoque());
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

}
