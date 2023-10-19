package model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Iterator;
import java.util.Vector;

import model.Produto;
import dao.*;
import dao.banco.ConnectionFactory;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws SQLException {

        DaoVenda v = new DaoVenda();
        System.out.println(v.TotalVendasPeriodo("2014-10-23 00:00:00", "2014-10-24 23:59:59"));  //venda por periodo
        System.out.println(v.TotalVendasPeriodo("2014-10-23 00:00:00", "2014-10-23 23:59:59"));  // venda do dia 

        // busca produto pelo nome
        DaoProdutosEstoque pe = new DaoProdutosEstoque();
        ArrayList<Produto> lp = new ArrayList<>();
        lp = pe.buscarProdutoEstoquePorNome("ra");

        for (int i = 0; i < lp.size(); i++) {
            System.out.println(lp.get(i).getNome());
        }
        
        // Busca os itens e a quantidade de cada item vendidos por um periodo
        DaoItensVenda iv = new DaoItensVenda();
        ArrayList<Produto> li = new ArrayList<>();
        li = iv.itensVendidosPorPeriodo("2015-01-16 00:00:00", "2015-01-18 23:59:59");

        for (int i = 0; i < li.size(); i++) {
            System.out.println("Nome: " + li.get(i).getNome()
                    + " Codigo: " + li.get(i).getCodigo()
                    + " Quantidade: " + li.get(i).getQuantidade());
        }
    }
}
