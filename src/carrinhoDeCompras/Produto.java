package carrinhoDeCompras;

public class Produto {

    private String tipo;
    private Double preco;
    private int quantidade;

    public Produto(String tipo, Double preco, int quantidade ) {
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quantidade;
    }




    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
