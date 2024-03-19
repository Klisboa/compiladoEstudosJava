package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private Cliente cliente;
    private List <Produto> itens = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    private Double valorTotal = 0.0;
    public Double somaPreco () {

        itens.forEach( item -> {
            valorTotal += (item.getPreco() * item.getQuantidade());
        });
         return valorTotal;
    }


}
