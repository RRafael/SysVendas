
package model;

public class ItensVenda {

    private int id;
    private int idVendas;
    private int idProdutoEstoque;
    private int quantidade;
    private float valorUnitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdProdutoEstoque() {
        return idProdutoEstoque;
    }

    public void setIdProdutoEstoque(int idProdutoEstoque) {
        this.idProdutoEstoque = idProdutoEstoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    private float valorTotal;
}
